package com.buck.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: hello-spring-cloud-alibaba
 * @description:
 * @author: buck
 * @create: 2020-07-10 14:53
 **/
@FeignClient("service-provider")
public interface EchoService {

    @GetMapping("/echo/{param1}")
    String echo(@PathVariable("param1") String s);

    @GetMapping("/echo/lb")
    String lb();
}
