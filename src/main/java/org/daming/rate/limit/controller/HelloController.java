package org.daming.rate.limit.controller;

import org.daming.rate.limit.annontaions.RateLimiter;
import org.daming.rate.limit.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author gming001
 * @version 2022-09-03 17:23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    @RateLimiter(time = 5,count = 3,limitType = LimitType.IP)
    public String hello() {
        return "hello >>> " + new Date();
    }
}
