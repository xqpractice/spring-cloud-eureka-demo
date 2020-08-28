package com.xqcao.practice.client.feign;

import com.xqcao.practice.client.response.HelloResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-two")
public interface OtherClient {
    @GetMapping("/hello/message/from-one")
    HelloResponse getHelloResult();
}
