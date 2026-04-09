package com.bank.account_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

    @Entity
    @Table(name = "accounts")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String accountNumber;

        @Column(nullable = false)
        private String holderName;

        @Column(nullable = false)
        private BigDecimal balance;

        @Column(nullable = false)
        private LocalDateTime createdAt;

    }
