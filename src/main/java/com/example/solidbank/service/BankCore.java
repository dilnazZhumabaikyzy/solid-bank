package com.example.solidbank.service;

import com.example.solidbank.model.AccountType;

public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    AccountCreationService accountCreationService;

    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreationService = accountCreationService;
    }

    public void createNewAccount(AccountType accountType,String clientId){
            accountCreationService.create(accountType, id, clientId, String.valueOf(lastAccountNumber));
            incrementLastAccountNumber();
    }

    private void incrementLastAccountNumber(){
        lastAccountNumber++;
    }
}
