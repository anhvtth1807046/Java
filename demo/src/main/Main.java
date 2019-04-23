package main;

import entity.Account;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(001,"HoaiAnhxinhgai");
        Account account2 = new Account("HoaiAnhxinhgai","hoaianh123");
        Account account3 = new Account("Anhngu123", "anhngu321",1000);
        Account account4 = new Account("anhngu321",1000, 0);

        System.out.println("TAI KHOAN 1");
        System.out.println("Id cua  la: " + account1.getId());
        System.out.println("Username  la: " + account1.getUsername());
        System.out.println("-----------------------------------------------");
        System.out.println("TAI KHOAN 2");
        System.out.println("Username  la: " + account2.getUsername());
        System.out.println("Password  la: " + account2.getPassword());
        System.out.println("-----------------------------------------------");
        System.out.println("TAI KHOAN 3");
        System.out.println("Username la :" + account3.getUsername());
        System.out.println("Password la :" + account3.getPassword());
        System.out.println("Balance la: " + account3.getBalace());
        System.out.println("-----------------------------------------------");
        System.out.println("TAI KHOAN 4");
        System.out.println("Password la:" + account4.getPassword());
        System.out.println("Balance la:" + account4.getBalace());
        System.out.println("Stautus la:" + account4.getStatus());
    }

}
