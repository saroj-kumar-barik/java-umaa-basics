package org.objects.bankAccount;

import org.objects.bankAccount.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating Instance of BankAccount class to access methods and Fields

        BankAccount sarojBankAccount = new BankAccount("Saroj", "8342932355",
                "EGOPB0848H", 77500);

        BankAccount babluBankAccount = new BankAccount("Bablu", "8342932356",
                "EGOPB9849H", 33500.20);

        System.out.println("Loan Amount to get by " + sarojBankAccount.getAccountHolderName() +
                " having Account Number " + sarojBankAccount.getAccountNumber() + " and PanNumber " + sarojBankAccount.getPanCardNumber() +
                " is " + sarojBankAccount.loanCalculator());

        System.out.println("Loan Amount to get by " + babluBankAccount.getAccountHolderName() +
                " having Account Number " + babluBankAccount.getAccountNumber() + " and PanNumber " + babluBankAccount.getPanCardNumber() +
                " is " + babluBankAccount.loanCalculator());


    }
}
