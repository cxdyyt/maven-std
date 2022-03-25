package com.jh.controller;

import com.jh.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tk")
public class FirstController {
    @Autowired
    FirstService firstService;

    @GetMapping("/getTicket")
    public String getTicket() {
        return firstService.getName();
    }
}
