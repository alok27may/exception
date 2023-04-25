package com.kumaral.exception.controller;

import com.kumaral.exception.exception.MyResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "home")
    public String home() {
        return "Hello Guest !!";
    }

    @GetMapping(value = "error-page")
    public String errorPage() {
        if (true) {
            throw new MyResourceNotFoundException("Resource Not found");
        }
        return "Hello Guest !!";
    }
}
