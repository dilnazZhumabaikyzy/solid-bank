package com.example.solidbank;

import com.example.solidbank.model.AccountBasicCli;
import com.example.solidbank.service.MyCLI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SolidbankApplication {

    public static void main(String[] args) {
        boolean running = true;
        String clientId = "1";
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        String helpMessage = "1 - showAccounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.println("Welcome to CLIBank!");
        System.out.println(helpMessage);
        System.out.println("Please enter the command number:");
        while (running){
            try {
                AccountBasicCli accountBasicCli = context.getBean(AccountBasicCli.class);
                MyCLI myCLI = context.getBean(MyCLI.class);
                switch (myCLI.getScanner().nextLine()){
                    case "1":
                        accountBasicCli.getAccounts(clientId);
                        break;
                    case "2":
                        System.out.println("Choose account type: [CHECKING, SAVING, FIXED]");
                        accountBasicCli.createAccountRequest(myCLI.requestAccountType(), clientId);
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input: " + e.getMessage());
            }
        }
    }

}
