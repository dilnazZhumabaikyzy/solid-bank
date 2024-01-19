package com.example.solidbank.model;

import com.example.solidbank.service.AccountListingService;
import com.example.solidbank.service.BankCore;

public class AccountBasicCli {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListingService;

    public AccountBasicCli(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    public void createAccountRequest(AccountType accountType, String clientId){
        bankCore.createNewAccount(accountType, clientId);
    }

    public void getAccounts(String clientId){
        System.out.println(accountListingService.getClientAccounts(clientId));
    }
}
