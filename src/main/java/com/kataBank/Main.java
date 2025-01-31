package com.kataBank;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("Hello Bank kata, this your transactions!");

        Account account = new Account();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        account.addTransaction(1000, dateFormat.parse("10-01-2012"));
        account.addTransaction(2000, dateFormat.parse("13-01-2012"));
        account.addTransaction( -500, dateFormat.parse("14-01-2012"));

        account.printStatement();
    }
}