package com.midatacomputer.exobankingapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank")
@RequiredArgsConstructor

public class BankController {

    @GetMapping
    public String bank() {
        return "Bank API (GET)";
    }
}
