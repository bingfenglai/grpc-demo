package pers.lbf.sbgrpc.provider.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ferryman
 * @since 2022/5/30 12:46
 */

@SpringBootApplication(scanBasePackages = "pers.lbf.sbgrpc.provider")
public class SbGRpcServiceProvider {
    public static void main(String[] args) {
        SpringApplication.run(SbGRpcServiceProvider.class, args);
    }
}
