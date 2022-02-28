package com.suraj.microservices.limitservice.controllers;

import com.suraj.microservices.limitservice.beans.Limits;
import com.suraj.microservices.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLinits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
