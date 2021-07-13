package com.example.demo.lecture.bank.domain;

public class BankAccountDTO {
    public static final String BANK_NAME = "비트은행";
    private String accountNumber;
    private String name;
    private int money;
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
        return String.format("\n%s님의 계좌 번호 : %s\n잔액은 %d입니다.",name,accountNumber,money);
    }
}

