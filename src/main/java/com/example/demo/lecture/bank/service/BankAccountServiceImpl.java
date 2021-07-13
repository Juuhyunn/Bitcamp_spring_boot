package com.example.demo.lecture.bank.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bicycle.domain.BicycleDTO;
import com.example.demo.lecture.bicycle.service.BicycleService;
import com.example.demo.lecture.dog.domian.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccountDTO;
    private Random random;
    private ArrayList<BankAccountDTO> banks;

    public BankAccountServiceImpl() {
        bankAccountDTO = new BankAccountDTO();
        random = new Random();
        banks = new ArrayList<>();
    }


    @Override
    public void add(BankAccountDTO bankAccount) {
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getAccountNumber());
        banks.add(bankAccount);
    }

    @Override
    public int count() {
        return banks.size();
    }

    @Override
    public List<BankAccountDTO> show() {
        return banks;
    }

    @Override
    public void createAccountNumber(BankAccountDTO bankAccountDTO) {
        String randomNumber = String.format("%d - %d - %d", random.nextInt(1000), random.nextInt(1000), random.nextInt(100000));
        bankAccountDTO.setAccountNumber(randomNumber);

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
