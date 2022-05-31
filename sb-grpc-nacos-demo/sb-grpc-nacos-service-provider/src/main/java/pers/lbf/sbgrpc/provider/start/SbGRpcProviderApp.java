package pers.lbf.sbgrpc.provider.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ferryman
 * @since 2022/5/31 16:12
 */
@SpringBootApplication(scanBasePackages = "pers.lbf.sbgrpc.provider")
@EnableDiscoveryClient
public class SbGRpcProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(SbGRpcProviderApp.class,args);
    }
}
