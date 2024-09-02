package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

    int accountNumber;
    double balance;
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void applyInterest() {
      System.out.println("Apply interest rate to account");
    }
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
