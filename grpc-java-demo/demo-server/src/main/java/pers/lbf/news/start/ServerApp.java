package pers.lbf.news.start;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import pers.lbf.news.server.service.NewsServiceImpl;

import java.io.IOException;

/**
 * @author ferryman
 * @since 2022/5/24 14:57
 */
public class ServerApp {

    public static void main(String[] args) throws InterruptedException, IOException {
        int port =9527;
        Server server = ServerBuilder
                .forPort(port)
                .addService(new NewsServiceImpl())
                .build();

        server.start();
        System.out.printf("server start completed！port: %d",port);
        server.awaitTermination();
        System.out.println("server exited successfully!");
    }
}
