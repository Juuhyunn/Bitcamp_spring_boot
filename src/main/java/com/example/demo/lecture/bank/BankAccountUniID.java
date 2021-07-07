package com.example.demo.lecture.bank;

class BankAccount {
    String accNumber;
    String ssNumber;
    int balance = 0;
    public BankAccount(String acc, String ss, int bal) {
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
}
class BankAccountUniID {
    public static void main(String[] args) {


        // 상수 (Constant)
        final int COLOR;
        COLOR = 11;
        //COLOR = 20; // 상수에 세팅을 또 해서 오류 남

        // 변수 (Variable)
        int color;
        color = 11;
        color = 20; // 여러 번 바뀔 수 있기 때문에 오류 안 남



        BankAccount yoon = new BankAccount("12-34-89", "990990-9090990", 10000);
        BankAccount park = new BankAccount("33-55-09", "770088-5959007",10000);
        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
