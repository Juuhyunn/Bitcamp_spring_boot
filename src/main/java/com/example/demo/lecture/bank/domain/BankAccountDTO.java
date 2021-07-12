package com.example.demo.lecture.bank.domain;

public class BankAccountDTO {
    private String accountNumber;
    private String name;
    private int money;
    private String bankName;
    private String date;
    private float interest;
    private int amount;

    public void setBalance(int money) {
        this.money = money;
    }
    public int getBalance() {
        return money;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return String.format("잔액은 %d입니다.",money);
    }
}
