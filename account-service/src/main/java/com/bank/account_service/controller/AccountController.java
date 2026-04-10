package com.bank.account_service.controller;

import com.bank.account_service.dto.CreateAccountRequest;
import com.bank.account_service.entity.Account;
import com.bank.account_service.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
        public Account createAccount(@RequestBody CreateAccountRequest request){

        return accountService.createAccount(request);

    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }
}
