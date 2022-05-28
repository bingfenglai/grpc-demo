package pers.lbf.news.client.start;

import io.grpc.ManagedChannel;
import pers.lbf.news.client.util.RpcUtil;
import pers.lbf.news.proto.SmsProtoMessage;
import pers.lbf.news.proto.SmsServiceGrpc;

import java.time.LocalDateTime;
import java.util.Iterator;

/**
 * @author ferryman
 * @since 2022/5/24 15:18
 */
public class SmsServerStreamClientAppDemo {


    public static void main(String[] args) {
        ManagedChannel managedChannel = null;
        try {

            managedChannel = RpcUtil.getManagedChannel();

            //===========================
            SmsServiceGrpc.SmsServiceBlockingStub smsServiceStub = SmsServiceGrpc.newBlockingStub(managedChannel);


            SmsProtoMessage.SmsSendReq smsSendReq = SmsProtoMessage.SmsSendReq.newBuilder()
                    .addNumber("121")
                    .addNumber("131")
                    .addNumber("143")
                    .addNumber("242")
                    .setContent("明天放假")
                    .build();

            Iterator<SmsProtoMessage.SmsSendResp> iterator = smsServiceStub.send(smsSendReq);

            while (iterator.hasNext()) {
                System.out.println(LocalDateTime.now() + "服务调用返回 " + iterator.next().getResult());
            }

        } finally {
            assert managedChannel != null;
            managedChannel.shutdown();
        }


    }
}
