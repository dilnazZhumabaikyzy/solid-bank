package com.example.solidbank.service.impl;

import com.example.solidbank.DAO.AccountDao;
import com.example.solidbank.model.Account;
import com.example.solidbank.model.AccountType;
import com.example.solidbank.model.AccountWithdraw;
import com.example.solidbank.service.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {
    AccountDao accountDao;

    public AccountListingServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientId) {
        return accountDao.getClientAccounts(clientId);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }
}
