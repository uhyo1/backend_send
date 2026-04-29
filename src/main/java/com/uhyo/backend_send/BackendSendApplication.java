package com.uhyo.backend_send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * backend_send サービスのエントリーポイント
 * このクラスから Spring Boot アプリケーションが起動する
 */
@SpringBootApplication
public class BackendSendApplication {

    public static void main(String[] args) {
        // Spring Boot アプリケーションを起動する
        SpringApplication.run(BackendSendApplication.class, args);
    }
}
