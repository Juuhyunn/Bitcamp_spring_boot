package com.example.demo.lecture.bank.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;

public interface BankAccountService {
    void deposit(BankAccountDTO bankAccountDTO);
    void withdraw(BankAccountDTO bankAccountDTO);
}
