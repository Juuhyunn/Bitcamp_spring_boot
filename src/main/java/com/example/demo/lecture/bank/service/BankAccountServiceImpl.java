package com.example.demo.lecture.bank.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccountDTO;
    private Random random;

    @Override
    public void createAccountNumber(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = new BankAccountDTO(); //개인의 계좌가 새로 생기는 것이니까 생성자는 여기서 쓰는 것
        this.random = new Random();
        String randomNumber = String.format("%d - %d - %d", random.nextInt(), random.nextInt(), random.nextInt());
        bankAccountDTO.setAccountNumber(randomNumber);
        System.out.println(randomNumber);
        //bankAccountDTO.setName(bankAccountDTO.getName());
    }

    @Override
    public int checkMyMoney(BankAccountDTO bankAccountDTO) {
        return bankAccountDTO.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bankAccountDTO) {
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() + bankAccountDTO.getMoney());
        return bankAccountDTO.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccountDTO) {
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() - bankAccountDTO.getMoney());
        return bankAccountDTO.getBalance();
    }

    @Override
    public void dropAccountNumber(BankAccountDTO bankAccountDTO) {

    }
}
