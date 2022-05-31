package pers.lbf.sbgrpc.consumer.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ferryman
 * @since 2022/5/31 16:29
 */
@SpringBootApplication(scanBasePackages = "pers.lbf.sbgrpc.consumer")
@EnableDiscoveryClient
public class SbGRpcConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(SbGRpcConsumerApp.class,args);
    }
}
