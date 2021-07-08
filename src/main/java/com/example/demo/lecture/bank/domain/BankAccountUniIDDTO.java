package com.example.demo.lecture.bank.domain;

public class BankAccountUniIDDTO {
    private String accNumber;
    private String ssNumber;
    private int amount;
    private int balance;

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }
    public String getSsNumber() {
        return ssNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    @Override
    public String toString() {
        return String.format("계좌 번호 : %s\n주민 번호 : %s\n잔액 : %d",accNumber,ssNumber,balance);
    }
/*
    String accNumber;
    String ssNumber;
    int balance = 0;

    public BankAccountInfo(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("계좌 번호 : " + accNumber);
        System.out.println("주민 번호 : " + ssNumber);
        System.out.println("잔 액 : " + balance + '\n');
        return balance;
    }
   */
}
