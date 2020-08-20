package com.buck.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hello-spring-cloud-alibaba
 * @description:
 * @author: buck
 * @create: 2020-07-10 10:54
 **/

@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Provider " + string;
    }

    @GetMapping(value = "/echo/lb")
    public String lb() {
        return "Response from port:" + port;
    }
}
