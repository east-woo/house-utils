package com.eastwoo.houseutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeatlthCheckController {

    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }
}
