package com.example.solidbank.service;

import com.example.solidbank.model.Account;
import com.example.solidbank.model.AccountType;
import com.example.solidbank.model.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccount(String clientId, String accountId);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    List<Account> getClientAccounts(String clientId);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
}
