package com.midatacomputer.exobankingapi.service.impl;


import com.midatacomputer.exobankingapi.repository.ClientRepository;
import com.midatacomputer.exobankingapi.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
}
