package com.bank.account_service.service;

import com.bank.account_service.dto.CreateAccountRequest;
import com.bank.account_service.dto.response.AccountResponse;
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

    public AccountResponse createAccount(CreateAccountRequest request) {

        Account account = Account.builder()
                .accountNumber(generateAccountNumber())
                .holderName(request.getHolderName())
                .balance(BigDecimal.ZERO)
                .createdAt(LocalDateTime.now())
                .build();

        Account savedAccount = accountRepository.save(account);

        return new AccountResponse(
                savedAccount.getId(),
                savedAccount.getHolderName(),
                savedAccount.getAccountNumber(),
                savedAccount.getBalance()
        );
    }

    public AccountResponse getAccountById(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        return new AccountResponse(
                account.getId(),
                account.getHolderName(),
                account.getAccountNumber(),
                account.getBalance()
        );
    }

    private String generateAccountNumber() {
        return "ACC-" + System.currentTimeMillis();
    }
}