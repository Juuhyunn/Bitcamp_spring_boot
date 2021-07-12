package com.example.demo.lecture.bank.controller;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bank.service.BankAccountService;
import com.example.demo.lecture.bank.service.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountController {
    private Scanner scanner;
    private BankAccountDTO bankAccountDTO;
    private BankAccountService bankAccountService;

    public BankAccountController() {
        this.scanner = new Scanner(System.in);
        this.bankAccountDTO = new BankAccountDTO();
        this.bankAccountService = new BankAccountServiceImpl();
    }

    public void bank() {
        while (true) {
            System.out.println(" [은행 메뉴] 0. 종료\t1. 입/출금\t2. 계좌 생성\t3. 계좌 삭제");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("은행을 종료합니다.");
                    return;
                case "1" :
                    System.out.println("얼마를 입금하시겠습니까?");
                    bankAccountDTO.setMoney(scanner.nextInt());
                    bankAccountService.deposit(bankAccountDTO);
                    System.out.println("잔고는 : " + bankAccountDTO.getMoney());
                    System.out.println("얼마를 출금하시겠습니까?");
                    bankAccountDTO.setMoney(scanner.nextInt());
                    bankAccountService.withdraw(bankAccountDTO);
                    System.out.println("잔고는 : " + bankAccountDTO.getBalance());
                    System.out.println("종료하시겠습니까? ( y / n )");
                    switch (scanner.next()) {
                        case "n":
                            break;
                        case "y":
                            return;
                    }
                case "2" :
                    System.out.println("이름이 무엇입니까?");
                    bankAccountDTO.setName(scanner.next());
                    bankAccountService.createAccountNumber(bankAccountDTO);
                    System.out.printf("[%s님의 계좌 번호] : %s", bankAccountDTO.getName(),bankAccountDTO.getAccountNumber());
                    System.out.println();
                    break;
            }
        }

        //bankAccount.setAmount(scanner.nextInt());
        //bankAccount.withdraw(bankAccount.getAmount());
        //System.out.println(bankAccount.toString());
        }
}
