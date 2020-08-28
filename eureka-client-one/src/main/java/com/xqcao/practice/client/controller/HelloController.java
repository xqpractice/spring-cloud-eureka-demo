package com.xqcao.practice.client.controller;

import com.xqcao.practice.client.feign.OtherClient;
import com.xqcao.practice.client.response.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private final OtherClient otherClient;

    public HelloController(OtherClient otherClient) {
        this.otherClient = otherClient;
    }

    @GetMapping("/message/{prop}")
    public HelloResponse getHelloMessage(@PathVariable String prop) {
        return new HelloResponse(prop, "I'm service one");
    }

    @GetMapping("/proxy")
    public HelloResponse getHelloProxy() {
        return otherClient.getHelloResult();
    }
}
