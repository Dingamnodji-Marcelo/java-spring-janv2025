package com.midatacomputer.exobankingapi.service.impl;

import com.midatacomputer.exobankingapi.repository.BankRepository;
import com.midatacomputer.exobankingapi.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;
}
