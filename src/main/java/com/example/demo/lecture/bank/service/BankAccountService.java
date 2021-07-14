package com.example.demo.lecture.bank.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;

import java.util.List;

public interface BankAccountService {
    void add(BankAccountDTO bankAccount);
    int count();
    List<BankAccountDTO> show();
    String[] findAllAccountNumber();
    //은행명은 변하지 않으니 상수로 정한다.
    //이름, 금액, 계좌번호 입력한 후 입금하고 잔액을 출력한다.
    //이름, 금액, 계좌번호 입력한 후 출금하고 잔액을 출력한다.
    //이름, 금액, 계좌번호, 은행명을 입력한 후 잔액을 확인한다.
    //이름을 입력한 후 계좌를 생성한다.
    //이름, 계좌번호를 입력한 후 계좌를 해지한다.
    public void createAccountNumber(BankAccountDTO bankAccountDTO);
    public int checkMyMoney(BankAccountDTO bankAccountDTO);
    public int deposit(BankAccountDTO bankAccountDTO);
    public int withdraw(BankAccountDTO bankAccountDTO);
    public void dropAccountNumber(BankAccountDTO bankAccountDTO);
}