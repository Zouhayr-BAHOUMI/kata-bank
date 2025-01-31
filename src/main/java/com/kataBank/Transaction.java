package com.kataBank;

import java.util.Date;

public class Transaction {


    private int amount;
    private int balance;
    private Date date;

    public Transaction(int amount, int balance, Date date) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }
}
