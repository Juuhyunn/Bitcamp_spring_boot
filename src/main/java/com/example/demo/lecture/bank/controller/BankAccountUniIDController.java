
package com.example.demo.lecture.bank.controller;

import com.example.demo.lecture.bank.domain.BankAccountUniIDDTO;

import java.util.Scanner;

public class BankAccountUniIDController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountUniIDDTO yoon = new BankAccountUniIDDTO();
        BankAccountUniIDDTO park = new BankAccountUniIDDTO();
        System.out.println("계좌 번호를 입력하세요");
        yoon.setAccNumber(scanner.next());
        System.out.println("주민 번호를 입력하세요");
        yoon.setSsNumber(scanner.next());
        System.out.println("입금할 금액을 입력하세요");
        yoon.setAmount(scanner.nextInt());
        yoon.deposit(yoon.getAmount());
        System.out.println("출금할 금액을 입력하세요");
        yoon.setAmount(scanner.nextInt());
        yoon.withdraw(yoon.getAmount());
        System.out.println(yoon.toString());


        /*
        // 상수 (Constant)
        final int COLOR;
        COLOR = 11;
        //COLOR = 20; // 상수에 세팅을 또 해서 오류 남
        // 변수 (Variable)
        int color;
        color = 11;
        color = 20; // 여러 번 바뀔 수 있기 때문에 오류 안 남
        BankAccountUniID yoon = new BankAccountUniID("12-34-89", "990990-9090990", 10000);
        BankAccountUniID park = new BankAccountUniID("33-55-09", "770088-5959007",10000);
        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
         */
    }
}
