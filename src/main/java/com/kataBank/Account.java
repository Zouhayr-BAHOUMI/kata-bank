package com.kataBank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Account implements AccountService{

    protected final List<Transaction> transactions = new ArrayList<Transaction>();
    private int balance= 0;

    @Override
    public void deposit(int amount) {
        balance += amount;
        transactions.add(new Transaction(amount,balance, new Date()));
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("solde insufficient.");
        }
        balance -= amount;
        transactions.add(new Transaction(-amount,balance, new Date()));
    }

    public void addTransaction(int amount, Date date) {
        balance += amount;
        transactions.add(new Transaction(amount,balance,date));
    }

    @Override
    public void printStatement() {
        System.out.println("Date            || Amount || Balance");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        List<Transaction> reverseTransactions = new ArrayList<>(transactions);
        Collections.reverse(reverseTransactions);

        for (Transaction transaction : reverseTransactions) {
            System.out.printf("%s || %d || %d%n",
                    formatter.format(transaction.getDate()),
                    transaction.getAmount(),
                    transaction.getBalance());
        }
    }
}
