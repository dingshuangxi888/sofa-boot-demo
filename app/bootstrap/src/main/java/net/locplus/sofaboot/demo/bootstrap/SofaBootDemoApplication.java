package net.locplus.sofaboot.demo.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "net.locplus.sofaboot.demo.web")
public class SofaBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SofaBootDemoApplication.class, args);
    }
}
