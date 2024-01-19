package com.example.solidbank.service.impl;

import com.example.solidbank.DAO.AccountDao;
import com.example.solidbank.model.*;
import com.example.solidbank.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDao accountDao;

    public AccountCreationServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void create(AccountType accountType, long bankId, String clientId, String accountId) {
            switch (accountType){
                case CHECKING -> accountDao.createNewAccount(new CheckingAccount(accountType, accountId, clientId, 0.0, true));
                case FIXED -> accountDao.createNewAccount(new FixedAccount(accountType, accountId, clientId, 0.0, false));
                case SAVING -> accountDao.createNewAccount(new SavingAccount(accountType, accountId, clientId, 0.0, true));
                default -> System.out.println("Wrong Input");
            }
    }
}
