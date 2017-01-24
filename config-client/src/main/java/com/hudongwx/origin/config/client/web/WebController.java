package com.hudongwx.origin.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WebController {

    @Value("${app}")
    private String app;

    @RequestMapping("/app")
    public String from() {
        return this.app;
    }


}
