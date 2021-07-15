package com.example.demo.lecture.bank.controller;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bank.service.BankAccountService;
import com.example.demo.lecture.bank.service.BankAccountServiceImpl;
import com.example.demo.lecture.util.service.LambdaUtils;

import java.util.Scanner;

public class BankAccountController extends LambdaUtils {
    private BankAccountService bankAccountService;
    private Scanner scanner;

    public BankAccountController() {
        this.bankAccountService = new BankAccountServiceImpl();
        scanner = new Scanner(System.in);
    }
    public void bank() {
        BankAccountDTO account = null;
        while (true) {

            //System.out.printf(" [ %s 메뉴 ] 0. 종료\t1. 입/출금\t2. 계좌 생성\t3. 계좌 번호 목록", account.BANK_NAME);
            print.accept(String.format("[ %s 메뉴 ] 0. 종료\t1. 입/출금\t2. 계좌 생성\t3. 계좌 번호 목록", account.BANK_NAME));
            System.out.println();
            switch (scanner.next()) {
                case "0":
                    print.accept("은행을 종료합니다.");
                    break;
                case "1":
                    print.accept("얼마를 입금하시겠습니까?");
                    account.setMoney(scanner.next());
                    deposit(account);
                    print.accept("잔고는 : " + account.getMoney());
                    print.accept("얼마를 출금하시겠습니까?");
                    account.setMoney(scanner.next());
                    withdraw(account);
                    print.accept("잔고는 : " + account.getBalance());
                case "2":
                    print.accept("이름이 무엇입니까?");
                    account.setName(scanner.next());
                    account.setAccountNumber(createAccountNumber(account));
                    add(account);
                    break;
                case "3" :
                    print.accept("현재 계좌 목록은 다음과 같습니다.");
                    for (String s : findAllAccountNumber()) {
                        print.accept(s + "\n");
                    }
                    break;
            }
            break;
        }

    }
    public void add(BankAccountDTO bankAccountDTO) {
        bankAccountService.add(bankAccountDTO);
    }


    public void show(){
        print.accept("현재 계좌 개수 : " + bankAccountService.count());
        print.accept(string.apply(bankAccountService.show()));
    }
    public String createAccountNumber(BankAccountDTO bankAccountDTO) {
        bankAccountService.createAccountNumber(bankAccountDTO);
        return bankAccountDTO.getAccountNumber();
    }
    public void checkMyMoney(BankAccountDTO bankAccountDTO) {
        bankAccountService.checkMyMoney(bankAccountDTO);
    }
    public void deposit(BankAccountDTO bankAccountDTO) {
        bankAccountService.deposit(bankAccountDTO);
    }
    public void withdraw(BankAccountDTO bankAccountDTO) {
        bankAccountService.withdraw(bankAccountDTO);
    }
    public void dropAccountNumber(BankAccountDTO bankAccountDTO) {
        bankAccountService.dropAccountNumber(bankAccountDTO);
    }

    public String[] findAllAccountNumber() {
        return bankAccountService.findAllAccountNumber();
    }

}
