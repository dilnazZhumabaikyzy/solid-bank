package com.example.solidbank.service;

import com.example.solidbank.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long bankId, String clientId, String accountId);
}
