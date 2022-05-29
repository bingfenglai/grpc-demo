package pers.lbf.news.server.service;

import io.grpc.stub.StreamObserver;
import pers.lbf.news.proto.SmsProtoMessage;
import pers.lbf.news.proto.SmsServiceGrpc;

import java.time.LocalDateTime;

/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2022/5/28 21:43
 */
public class SmsServiceImpl extends SmsServiceGrpc.SmsServiceImplBase {

    /**
     * <pre>
     * 双向流
     * </pre>
     *
     * @param responseObserver
     */
    @Override
    public StreamObserver<SmsProtoMessage.PhoneReq> createWith2Stream(StreamObserver<SmsProtoMessage.CreateAndSendResp> responseObserver) {
        return new StreamObserver<SmsProtoMessage.PhoneReq>() {
            @Override
            public void onNext(SmsProtoMessage.PhoneReq phoneReq) {
                System.out.println(LocalDateTime.now() + "录入手机号" + phoneReq.getPhone());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                SmsProtoMessage.CreateAndSendResp createAndSendResp = SmsProtoMessage.CreateAndSendResp.newBuilder()
                        .setMsg("已录入手机号" + phoneReq.getPhone())
                        .build();
                responseObserver.onNext(createAndSendResp);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println(LocalDateTime.now() + "本次处理完成");
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * 服务端流式通信
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void send(SmsProtoMessage.SmsSendReq request, StreamObserver<SmsProtoMessage.SmsSendResp> responseObserver) {

        request.getNumberList().forEach(
                number -> {
                    SmsProtoMessage.SmsSendResp smsSendResp = SmsProtoMessage.SmsSendResp.newBuilder()
                            .setResult(number + request.getContent())
                            .build();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    responseObserver.onNext(smsSendResp);
                }
        );

        responseObserver.onCompleted();

    }


    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<SmsProtoMessage.CreatePhoneReq> createPhone(StreamObserver<SmsProtoMessage.CreatePhoneResp> responseObserver) {
        return new StreamObserver<SmsProtoMessage.CreatePhoneReq>() {

            int i = 0;

            /**
             * 收到请求时
             * @param createPhoneReq
             */
            @Override
            public void onNext(SmsProtoMessage.CreatePhoneReq createPhoneReq) {
                System.out.println("收到手机号：" + createPhoneReq.getPhone());
                i++;
            }

            /**
             * 发生错误时
             * @param throwable
             */
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            /**
             * 处理完成时
             */
            @Override
            public void onCompleted() {
                SmsProtoMessage.CreatePhoneResp createPhoneResp = SmsProtoMessage.CreatePhoneResp.newBuilder()
                        .setMsg(String.format("录入手机号完成，共录入%d个", i))
                        .build();

                responseObserver.onNext(createPhoneResp);
                responseObserver.onCompleted();


            }
        };
    }
}
