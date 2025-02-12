package com.midatacomputer.exobankingapi.service.impl;

import com.midatacomputer.exobankingapi.repository.AgentRepository;
import com.midatacomputer.exobankingapi.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService {
    private final AgentRepository agentRepository;
}
