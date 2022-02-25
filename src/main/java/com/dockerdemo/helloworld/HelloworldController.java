package com.dockerdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/")
    public String getHelloFromDocker(){
        return "Hello From Docker Container";
    }

}
