package pers.lbf.sbgrpc.consumer.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ferryman
 * @since 2022/5/30 13:13
 */
@SpringBootApplication(scanBasePackages = "pers.lbf.sbgrpc.consumer")
public class SbGRpcServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SbGRpcServiceConsumer.class, args);
    }
}
