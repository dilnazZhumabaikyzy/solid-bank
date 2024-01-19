package com.example.solidbank.service;

import com.example.solidbank.model.AccountType;
import com.example.solidbank.model.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;


    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }
    public double requestClientAmount(){
        return 0;
    }

    public String requestAccountClientNumber(){
        return "";
    }

    public Scanner getScanner() {
        return scanner;
    }
}

