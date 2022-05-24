package pers.lbf.news.client.start;

import com.google.common.util.concurrent.Atomics;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pers.lbf.news.proto.NewsProto;
import pers.lbf.news.proto.NewsServiceGrpc;

import java.util.concurrent.*;

/**
 * @author ferryman
 * @since 2022/5/24 15:18
 */
public class ClientApp {

    final static String serverHost = "192.168.3.6";
    final static Integer serverPort = 9527;


    public static void main(String[] args) {

        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress(serverHost, serverPort)
                .usePlaintext()
                .build();

        NewsServiceGrpc.NewsServiceBlockingStub newsServiceStub = NewsServiceGrpc.newBlockingStub(managedChannel);

        NewsProto.NewsReq newsReq = NewsProto.NewsReq
                .newBuilder()
                .setDate("2022-05-24")
                .build();

        NewsProto.NewsResp list = newsServiceStub.list(newsReq);

        list.getNewsList().forEach(System.out::println);

//        NewsServiceGrpc.NewsServiceFutureStub newsServiceFutureStub = NewsServiceGrpc.newFutureStub(managedChannel);
//
//        ListenableFuture<NewsProto.NewsResp> newsRespListenableFuture = newsServiceFutureStub.list(newsReq);
//        ConcurrentMap<String, NewsProto.NewsResp> map = new ConcurrentHashMap<>(1);
//        Futures.addCallback(newsRespListenableFuture,
//                new FutureCallback< NewsProto.NewsResp>() {
//
//                    @Override
//                    public void onSuccess(NewsProto.NewsResp newsResp) {
//                        map.put("newsResp",newsResp);
//                    }
//
//                    @Override
//                    public void onFailure(Throwable throwable) {
//
//                    }
//                },Executors.newSingleThreadExecutor()
//        );
//
//        while (map.isEmpty()) {
////            System.out.println("执行其他任务");
//        }
//
//        map.get("newsResp").getNewsList().forEach(System.out::println);
//
//
//
//
    }
}
