package com.midatacomputer.exobankingapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agent")
@RequiredArgsConstructor

public class AgentController {

    @GetMapping
    public String getAgent() {
        return "Agent API (GET)";
    }
}
