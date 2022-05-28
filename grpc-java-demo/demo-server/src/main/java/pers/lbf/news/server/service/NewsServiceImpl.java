package pers.lbf.news.server.service;


import io.grpc.stub.StreamObserver;
import pers.lbf.news.proto.NewsProtoMessage;
import pers.lbf.news.proto.NewsServiceGrpc;

import java.util.UUID;

/**
 * @author ferryman
 * @since 2022/5/24 14:45
 */
public class NewsServiceImpl extends NewsServiceGrpc.NewsServiceImplBase {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(NewsProtoMessage.NewsReq request, StreamObserver<NewsProtoMessage.NewsResp> responseObserver) {

        String dateStr = request.getDate();
        NewsProtoMessage.NewsResp resp = null;


        try {


            NewsProtoMessage.NewsResp.Builder newsRespBuilder = NewsProtoMessage.NewsResp.newBuilder();

            for (int i = 0; i < 10; i++) {
                NewsProtoMessage.News news = NewsProtoMessage.News.newBuilder()
                        .setId(i)
                        .setCreateTime(System.currentTimeMillis())
                        .setTitle("news" + 1 + dateStr)
                        .setContent(UUID.randomUUID().toString())
                        .build();
                newsRespBuilder.addNews(news);
            }

            resp = newsRespBuilder.build();

        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onNext(resp);
        }

        responseObserver.onCompleted();

    }
}
