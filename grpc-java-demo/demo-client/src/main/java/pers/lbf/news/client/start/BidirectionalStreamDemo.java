/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package pers.lbf.news.client.start;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import pers.lbf.news.client.util.RpcUtil;
import pers.lbf.news.proto.SmsProtoMessage;
import pers.lbf.news.proto.SmsServiceGrpc;

import java.time.LocalDateTime;

/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2022/5/29 23:15
 */
public class BidirectionalStreamDemo {

    public static void main(String[] args) {
        ManagedChannel channel = RpcUtil.getManagedChannel();
        SmsServiceGrpc.SmsServiceStub smsServiceStub = SmsServiceGrpc.newStub(channel);

        final boolean[] flag = {false};
        StreamObserver<SmsProtoMessage.CreateAndSendResp> respStreamObserver = new StreamObserver<SmsProtoMessage.CreateAndSendResp>() {
            @Override
            public void onNext(SmsProtoMessage.CreateAndSendResp resp) {
                System.out.println(LocalDateTime.now() + "收到服务器返回消息：" + resp.getMsg());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                flag[0] = true;
            }
        };


        StreamObserver<SmsProtoMessage.PhoneReq> createAndSendReqSb = smsServiceStub.createWith2Stream(respStreamObserver);

        for (int i = 0; i < 10; i++) {
            createAndSendReqSb.onNext(
                    SmsProtoMessage.PhoneReq.newBuilder()
                            .setPhone("131" + i)
                            .build()
            );
        }

        createAndSendReqSb.onCompleted();
        System.out.println(LocalDateTime.now() + "请求完成");
        while (!flag[0]) {
//            System.out.println("休眠200ms");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
