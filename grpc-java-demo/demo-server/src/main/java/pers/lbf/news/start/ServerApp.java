package pers.lbf.news.start;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import pers.lbf.news.server.service.NewsServiceImpl;
import pers.lbf.news.server.service.SmsServiceImpl;

import java.io.IOException;

/**
 * @author ferryman
 * @since 2022/5/24 14:57
 */
public class ServerApp {
    final static int SERVER_PORT = 9527;

    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder
                .forPort(SERVER_PORT)
                .addService(new NewsServiceImpl())
                .addService(new SmsServiceImpl())
                .build();
        System.out.printf("server start completed！port: %d", SERVER_PORT);

        server.start();
        System.out.printf("server start completed！port: %d", SERVER_PORT);
        server.awaitTermination();
        System.out.println("server exited successfully!");
    }
}
