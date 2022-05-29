/*
 * Copyright 2020 赖柄沣 bingfengdev@aliyun.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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
 * @date 2022/5/29 22:08
 */
public class SmsClientStreamDemo {

    public static void main(String[] args) {
        ManagedChannel channel = RpcUtil.getManagedChannel();

        SmsServiceGrpc.SmsServiceStub smsServiceStub = SmsServiceGrpc.newStub(channel);
        final boolean[] flag = {false};
        StreamObserver<SmsProtoMessage.CreatePhoneResp> respStreamObserver = new StreamObserver<SmsProtoMessage.CreatePhoneResp>() {
            @Override
            public void onNext(SmsProtoMessage.CreatePhoneResp resp) {
                System.out.println(resp.getMsg());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println(LocalDateTime.now() + "  完成！");
                flag[0] = true;
            }
        };


        StreamObserver<SmsProtoMessage.CreatePhoneReq> reqStreamObserver = smsServiceStub.createPhone(respStreamObserver);

        SmsProtoMessage.CreatePhoneReq.Builder builder = SmsProtoMessage.CreatePhoneReq.newBuilder();
        for (int i = 0; i < 10; i++) {
            builder.setPhone("131" + i);

            SmsProtoMessage.CreatePhoneReq createPhoneReq = builder.build();
            reqStreamObserver.onNext(createPhoneReq);
        }

        reqStreamObserver.onCompleted();


        while (!flag[0]) {
            try {
                System.out.println("休眠200ms");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
