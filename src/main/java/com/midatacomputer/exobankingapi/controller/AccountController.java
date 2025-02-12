package com.midatacomputer.exobankingapi.controller;

import com.midatacomputer.exobankingapi.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor

public class AccountController {

    @GetMapping
    public Account getAccount() {
        return new Account();
    }
}
