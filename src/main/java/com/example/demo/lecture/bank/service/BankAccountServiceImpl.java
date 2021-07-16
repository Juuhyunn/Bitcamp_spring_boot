package com.example.demo.lecture.bank.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bicycle.domain.BicycleDTO;
import com.example.demo.lecture.bicycle.service.BicycleService;
import com.example.demo.lecture.dog.domian.DogDTO;
import com.example.demo.lecture.util.service.LambdaUtils;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService{
    private BankAccountDTO bankAccountDTO;
    private Random random;
    private ArrayList<BankAccountDTO> banks;
    private UtilService utilService;

    public BankAccountServiceImpl() {
        bankAccountDTO = new BankAccountDTO();
        random = new Random();
        banks = new ArrayList<>();
        utilService = new UtilServiceImpl();
    }
    @Override
    public void add(BankAccountDTO bankAccount) {
        banks.add(bankAccount);
    }

    @Override
    public int count() {
        return banks.size();
    }

    @Override
    public List<? extends BankAccountDTO> show() {
        return banks;
    }

    @Override
    public String[] findAllAccountNumber() {
        int count = count();
        String[] accountNumbers = new String[count()]; //this는 생략할 수 있쥐
        for (int i = 0; i < count() ;i++){
            accountNumbers[i] = banks.get(i).getAccountNumber();//??
        }
        return accountNumbers;
    }
    @Override
    public void createAccountNumber(BankAccountDTO bankAccountDTO) {
        UtilService utilService = new UtilServiceImpl();
        bankAccountDTO.setDate(utilService.todayAndCurrentTime());
        String randomNumber = "";
        //String first = "";
        randomNumber += utilService.randomNumbers(4,false) + "-";
        for (int i = 0; i < 3; i++) {
            randomNumber += utilService.randomNumbers(4,true);
            //first = num.substring(0, 1);
            /* 0이 앞자리로 오지 못하게
            while (first.equals("0")) {
                System.out.println("원래 숫자 : " + num);
                num = utilService.randomNumbers(4);
                System.out.println("바꾼 숫자 : " + num);
                first = num.substring(0, 1);
                break;
            }
             */
            switch (i) {
                case 2:
                    bankAccountDTO.setAccountNumber(randomNumber);
                    return;
            }
            randomNumber += "-";
        }
    }

    @Override
    public String checkMyMoney(BankAccountDTO bankAccountDTO) {
        return bankAccountDTO.getMoney();
    }

    @Override
    public BankAccountDTO findAccountByAccountNumber(String accountNumber) {
        System.out.println("실행은 됐어?");
        BankAccountDTO bankAccount = new BankAccountDTO();
        for (BankAccountDTO b : banks) {
            if(accountNumber.equals(b.getAccountNumber())) {
                bankAccount = b;
                break;
            }
        }
        print.accept("체크는 완료");
        return bankAccount;
    }

    @Override
    public String findBalanceByAccountNumber(String accountNumber) {
        String balance = "";
        for(BankAccountDTO b : banks) {
            balance = accountNumber.equals(b.getAccountNumber()) ? b.getBalance() : "0";
        }
        return balance;
    }

    @Override
    public void deposit(BankAccountDTO bankAccountDTO) {
        for (BankAccountDTO b : banks) {
            if(bankAccountDTO.getAccountNumber().equals(b.getAccountNumber())) {
                print.accept("??");
                System.out.println(b.getAccountNumber());
                System.out.println(b.getBalance());
                System.out.println(strToInt.apply(b.getBalance()));
                int a = strToInt.apply(b.getBalance());
                print.accept(string.apply(a));
                //얘가 널이 나와?????????

                print.accept(string.apply(strToInt.apply(b.getBalance())));
                int balance = strToInt.apply(b.getBalance());
                b.setBalance(string.apply(balance + strToInt.apply(bankAccountDTO.getMoney())));
                print.accept("입금 후 정보 : " + b);
                break;
                } else {
                print.accept("잘못된 계좌 번호 입니다.");
            }
        }
    }

    @Override
    public void withdraw(BankAccountDTO bankAccountDTO) {
        //bankAccountDTO.setBalance((String)((int)bankAccountDTO.getBalance() - (int)bankAccountDTO.getMoney()));
        //return bankAccountDTO.getBalance();
    }

    @Override
    public void dropAccountNumber(BankAccountDTO bankAccountDTO) {

    }
}
