package com.siletti.microservices.limitsdemo;

import com.siletti.microservices.limitsdemo.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration getLimitsConfig(){

        return new LimitConfiguration(1000, 1) ;
    }
}
