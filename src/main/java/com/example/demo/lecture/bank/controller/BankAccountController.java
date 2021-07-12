package com.example.demo.lecture.bank.controller;

import com.example.demo.lecture.bank.domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = new BankAccountDTO();
        System.out.println("얼마를 입금하시겠습니까?");
        bankAccount.setAmount(scanner.nextInt());
        //bankAccount.deposit(bankAccount.getAmount());
        System.out.println(bankAccount.toString());
        System.out.println("얼마를 출금하시겠습니까?");
        bankAccount.setAmount(scanner.nextInt());
        //bankAccount.withdraw(bankAccount.getAmount());
        System.out.println(bankAccount.toString());
        }
}
