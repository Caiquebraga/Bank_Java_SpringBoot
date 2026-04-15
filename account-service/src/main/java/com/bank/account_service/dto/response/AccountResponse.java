package com.bank.account_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {

    private long id;
    private String holderName;
    private String accountNumber;
    private BigDecimal balance;
}
