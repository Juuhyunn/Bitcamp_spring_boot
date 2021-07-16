package com.example.demo.lecture.bank.controller;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bank.service.BankAccountService;
import com.example.demo.lecture.bank.service.BankAccountServiceImpl;
import com.example.demo.lecture.util.service.LambdaUtils;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BankAccountController extends LambdaUtils {
    private BankAccountService bankAccountService;
    private Scanner scanner;
    private BankAccountDTO account;
    private UtilService utilService;

    public BankAccountController() {
        this.bankAccountService = new BankAccountServiceImpl();
        scanner = new Scanner(System.in);
        utilService = new UtilServiceImpl();
    }
    public void bank() {
        account = null;
        while (true) {
            //System.out.printf(" [ %s 메뉴 ] 0. 종료\t1. 입/출금\t2. 계좌 생성\t3. 계좌 번호 목록", account.BANK_NAME);
            print.accept(String.format("\n[ %s 메뉴 ] 0. 종료\t1. 입금\t2. 출금\t3. 계좌 생성\t4. 계좌 번호 목록", account.BANK_NAME));
            System.out.println();
            switch (scanner.next()) {
                case "0":
                    print.accept("은행을 종료합니다.");
                    return;
                case "1":
                    account = new BankAccountDTO();
                    print.accept("입금을 실행합니다.\n계좌를 입력하세여.");
                    account.setAccountNumber(scanner.next());
                    print.accept("금액을 입력하세요");
                    account.setMoney(scanner.next());
                    bankAccountService.deposit(account);
                    break;
                case "2" :
                    break;
                case "3":
                    account = new BankAccountDTO();
                    print.accept("\n이름이 무엇입니까?\n");
                    account.setName(scanner.next());
                    account.setAccountNumber(createAccountNumber(account));
                    add(account);
                    break;
                case "4" :
                    print.accept("현재 계좌 개수 : " + bankAccountService.count());
                    print.accept("\n현재 계좌 목록은 다음과 같습니다.\n");
                    List<? extends BankAccountDTO> list = bankAccountService.show();
                    for (BankAccountDTO l : list ) {
                        print.accept(l.toString());
                    }
                    break;
            }
        }
    }
    public void add(BankAccountDTO bankAccountDTO) {
        bankAccountService.add(bankAccountDTO);
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
