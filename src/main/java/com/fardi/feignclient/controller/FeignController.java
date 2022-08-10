package com.fardi.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class FeignController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public Map<String,String> FeignClient() {
        return Map.of("message", "Feign Client is up and running on port: " + environment.getProperty("local.server.port") +" ☕🍵");
    }

}
