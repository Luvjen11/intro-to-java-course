package com.cbfacademy.accounts;

public class Account {

    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double deposit(double amount) {
       double deposit = amount + balance;
       return deposit;
    }

    public double withdraw(double requested) {
        if (requested < 0) { // negative request handling
            return 0.0;
        }

        if (requested <= balance) {
            this.balance -= requested;
            return requested;
        } else {
            return 0.0;
        }
    }

}
