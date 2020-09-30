package org.objects.bankAccount;

public class BankAccount {
    // Declaring fields as private
    private String accountHolderName, accountNumber, panCardNumber;
    private double monthlySalary;

    // Creating Constructor to initialize fields
    public BankAccount(String accountHolderName, String accountNumber, String panCardNumber, double monthlySalary) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.panCardNumber = panCardNumber;
        this.monthlySalary = monthlySalary;
    }

    // Creating getters to access private fields as public methods from the main method

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public double loanCalculator() {
        // Calculating yearly salary and Providing certain percentage of loan

        if (monthlySalary > 60000) {
            return (60000 * 12 * 12.5) / 100;
        }

        if (monthlySalary >= 30000 && monthlySalary < 60000) {
            return (30000 * 12 * 10.5) / 100;
        }

        if (monthlySalary < 20000) {
            return 0;
        }
        return 0;
    }

}
