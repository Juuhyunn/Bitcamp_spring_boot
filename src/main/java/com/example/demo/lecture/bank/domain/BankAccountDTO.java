package com.example.demo.lecture.bank.domain;

public class BankAccountDTO {
    private String accountNumber;
    private String name;
    private int money;
    public static final String BANK_NAME = "비트은행";
    private String date;
    private float interest;
    private int balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public float getInterest() {
        return interest;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("잔액은 %d입니다.",money);
    }
}
