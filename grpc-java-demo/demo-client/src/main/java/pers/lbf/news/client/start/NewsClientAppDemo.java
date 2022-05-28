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

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import pers.lbf.news.client.util.RpcUtil;
import pers.lbf.news.proto.NewsProtoMessage;
import pers.lbf.news.proto.NewsServiceGrpc;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;

/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2022/5/29 0:40
 */
public class NewsClientAppDemo {
    public static void main(String[] args) {
        ManagedChannel managedChannel = null;

        try {

            managedChannel = RpcUtil.getManagedChannel();

            NewsServiceGrpc.NewsServiceBlockingStub newsServiceStub = NewsServiceGrpc.newBlockingStub(managedChannel);

            NewsProtoMessage.NewsReq newsReq = NewsProtoMessage.NewsReq
                    .newBuilder()
                    .setDate("2022-05-24")
                    .build();

            NewsProtoMessage.NewsResp list = newsServiceStub.list(newsReq);

            list.getNewsList().forEach(System.out::println);

            NewsServiceGrpc.NewsServiceFutureStub newsServiceFutureStub = NewsServiceGrpc.newFutureStub(managedChannel);

            ListenableFuture<NewsProtoMessage.NewsResp> newsRespListenableFuture = newsServiceFutureStub.list(newsReq);
            ConcurrentMap<String, NewsProtoMessage.NewsResp> map = new ConcurrentHashMap<>(1);
            Futures.addCallback(newsRespListenableFuture,
                    new FutureCallback<NewsProtoMessage.NewsResp>() {

                        @Override
                        public void onSuccess(NewsProtoMessage.NewsResp newsResp) {
                            map.put("newsResp", newsResp);
                        }

                        @Override
                        public void onFailure(Throwable throwable) {
                            System.err.println(throwable);
                        }
                    }, Executors.newSingleThreadExecutor()
            );

            while (map.isEmpty()) {
                System.out.println("执行其他任务");
            }

            map.get("newsResp").getNewsList().forEach(System.out::println);

        } finally {
            assert managedChannel != null;
            managedChannel.shutdown();
        }


    }
}
