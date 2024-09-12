package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double withdraw(double requested) {
        if (requested < 0) { // negative request handling
            return 0.0;
        }

        if (requested <= balance + overdraftLimit) {
            this.balance -= requested;
            return requested;
        } else {
            return 0.0;
        }
    }


    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
       this.overdraftLimit = overdraftLimit;
    }
}
