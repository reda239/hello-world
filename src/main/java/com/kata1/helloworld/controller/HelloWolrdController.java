package com.kata1.helloworld.controller;

import com.kata1.helloworld.service.impl.HelloWolrdServiceImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloWolrdController {
    private final  HelloWolrdServiceImpl helloWolrdService;
    @PostMapping
    String helloWolrd(){
        return helloWolrdService.helloWolrd ();
    }
}
