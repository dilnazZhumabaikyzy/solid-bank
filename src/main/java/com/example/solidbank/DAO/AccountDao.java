package com.example.solidbank.DAO;

import com.example.solidbank.model.Account;
import com.example.solidbank.model.AccountType;
import com.example.solidbank.model.AccountWithdraw;

import java.util.List;

public interface AccountDao {
    List<Account> getClientAccounts(String clientId);
    void createNewAccount(Account account);
    void updateAccount(Account account);

    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    Account getClientAccount(String clientId, String accountId);
}
