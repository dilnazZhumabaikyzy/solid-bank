package com.example.solidbank.DAO;

import com.example.solidbank.model.Account;
import com.example.solidbank.model.AccountType;
import com.example.solidbank.model.AccountWithdraw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoryAccountDao implements AccountDao{
     List<Account> accountList = new ArrayList<>();
    @Override
    public List<Account> getClientAccounts(String clientId) {
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Bank account created successfully");
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return null;
    }
}
