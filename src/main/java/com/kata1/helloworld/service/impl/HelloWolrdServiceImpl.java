package com.kata1.helloworld.service.impl;

import com.kata1.helloworld.service.HelloWolrdService;
import org.springframework.stereotype.Service;

@Service
public class HelloWolrdServiceImpl implements HelloWolrdService {
    public String helloWolrd()  {
            return "hello wolrd";

    }
}
