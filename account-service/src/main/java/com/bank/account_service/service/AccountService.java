package com.bank.account_service.service;

import com.bank.account_service.dto.CreateAccountRequest;
import com.bank.account_service.entity.Account;
import com.bank.account_service.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account createAccount(CreateAccountRequest request) {

        Account account = Account.builder()
                .accountNumber(generateAccountNumber())
                .holderName(request.getHolderName())
                .balance(BigDecimal.ZERO)
                .createdAt(LocalDateTime.now())
                .build();

        return accountRepository.save(account);
    }

    private String generateAccountNumber() {
        return "ACC-" + System.currentTimeMillis();
    }
}