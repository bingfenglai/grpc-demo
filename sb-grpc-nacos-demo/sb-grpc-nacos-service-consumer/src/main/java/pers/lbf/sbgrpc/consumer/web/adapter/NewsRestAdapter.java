package pers.lbf.sbgrpc.consumer.web.adapter;

import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.lbf.news.proto.NewsProtoMessage;
import pers.lbf.news.proto.NewsServiceGrpc;

import pers.lbf.sbgrpc.consumer.web.vo.NewsVO;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ferryman
 * @since 2022/5/30 13:15
 */
@RestController
@RequestMapping("/news")
@Slf4j
public class NewsRestAdapter {

    @GrpcClient("SB-GRPC-PROVIDER")
    NewsServiceGrpc.NewsServiceBlockingStub newsService;

    @GetMapping
    public Mono<Object> get() {
        NewsProtoMessage.NewsResp newsResp = newsService.list(NewsProtoMessage.NewsReq.newBuilder().setDate("2022-05-30").build());
        List<NewsVO> newsList = new ArrayList<>(newsResp.getNewsCount());
        for (NewsProtoMessage.News news : newsResp.getNewsList()) {
            NewsVO newsVO = new NewsVO();
            BeanUtils.copyProperties(news, newsVO);
            newsList.add(newsVO);
        }
        return Mono.just(newsList);
    }
}
