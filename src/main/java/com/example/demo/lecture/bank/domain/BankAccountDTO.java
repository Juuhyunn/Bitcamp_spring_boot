package com.example.demo.lecture.bank.domain;

public class BankAccountDTO {
    private int balance;
    private int amount;

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
        return String.format("잔액은 %d입니다.",balance);
    }
}
