package com.hudongwx.origin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer //开启Config Server
@SpringBootApplication
public class ConfigServerAplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerAplication.class)
                .web(true)
                .run(args);
    }
}
