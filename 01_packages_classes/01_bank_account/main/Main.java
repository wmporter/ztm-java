package main;

import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        acct.accountHolder = "Me";
        acct.accountNumber = 324;
        acct.balance = 1023.99;
        
        System.out.print("holder: " + acct.accountHolder);
        System.out.print(" balance: ");
        System.out.println(acct.balance);
    }
}
