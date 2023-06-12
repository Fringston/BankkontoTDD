package org.example;

public class Account {
    double initialCash;
    int accountNumber;

    public Account(double initialCash, int accountNumber) {
        this.initialCash = initialCash;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return initialCash;
    }
    public void deposit(double cash) {
        if (cash > 0) {
            initialCash += cash;
        }
        else {
            System.out.println("You can't deposit a negative amount of money or 0.");
        }
    }
    public void withdraw(double cash) {
        if (cash > 0 && cash <= initialCash) {
            initialCash -= cash;
        }
        else {
            System.out.println("You can't withdraw a negative amount of money or more money than you have.");
        }
    }
}
