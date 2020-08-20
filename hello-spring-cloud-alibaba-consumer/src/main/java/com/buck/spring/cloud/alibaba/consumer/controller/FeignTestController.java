package com.buck.spring.cloud.alibaba.consumer.controller;

import com.buck.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hello-spring-cloud-alibaba
 * @description:
 * @author: buck
 * @create: 2020-07-10 14:56
 **/

@RestController
@RefreshScope
public class FeignTestController {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String name;

    @GetMapping("/feign/echo/{str}")
    public String echo(@PathVariable("str") String str){
        return echoService.echo(str);
    }

    @GetMapping("/feign/lb")
    public String lb(){
        return echoService.lb();
    }

    @GetMapping("/feign/config")
    public String config(){
        return name;
    }
}
