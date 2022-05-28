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

package pers.lbf.news.server.service;

import io.grpc.stub.StreamObserver;
import pers.lbf.news.proto.SmsProtoMessage;
import pers.lbf.news.proto.SmsServiceGrpc;

/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2022/5/28 21:43
 */
public class SmsServiceImpl extends SmsServiceGrpc.SmsServiceImplBase {

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
}
