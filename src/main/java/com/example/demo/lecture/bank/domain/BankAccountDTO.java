package com.example.demo.lecture.bank.domain;

public class BankAccountDTO {
    public static final String BANK_NAME = "비트은행";
    private String accountNumber;
    private String name;
    private String money;
    private String date;
    private String interest;
    private String balance;

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
    public void setMoney(String money) {
        this.money = money;
    }
    public String getMoney() {
        return money;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setInterest(String interest) {
        this.interest = interest;
    }
    public String getInterest() {
        return interest;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public String getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("\n%s님의 계좌 번호 : %s\t잔액은 %d입니다.",name,accountNumber,money);
    }
}

