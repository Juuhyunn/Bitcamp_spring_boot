package com.example.demo.common.controller;

import com.example.demo.lecture.bank.controller.BankAccountController;
import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bank.service.BankAccountService;
import com.example.demo.lecture.bank.service.BankAccountServiceImpl;
import com.example.demo.lecture.bicycle.controller.BicycleController;
import com.example.demo.lecture.bicycle.domain.BicycleDTO;
import com.example.demo.lecture.dog.controller.DogController;
import com.example.demo.lecture.dog.domian.DogDTO;
import com.example.demo.lecture.dog.service.DogService;
import com.example.demo.lecture.dog.service.DogServiceImpl;
import com.example.demo.lecture.math.controller.CalculatorController;
import com.example.demo.lecture.util.controller.UtilController;
import com.example.demo.lecture.util.domain.UtilDTO;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();
        while (true) {
            System.out.println("\n=====================================================================");
            System.out.println(" [메뉴] 0. 종료\t1. 계산기\t2. 수열\t3. Dog\t4. Bicycle\t5. 오늘 날짜\t6. 은행");
            System.out.println("=====================================================================");
            switch (scanner.next()) {
                case "0":
                    System.out.println("종료합니다.");
                    return;
                case "1":
                    System.out.println("계산기가 실행됩니다");
                    new CalculatorController().calculate();
                    break;
                case "2":
                    System.out.println("수열이 실행됩니다.");
                    new CalculatorController().sequence();
                    break;
                case "3":
                    System.out.println("Dog를 실행합니다.");
                    DogDTO dog = new DogDTO();
                    //위의 두 줄을 줄여서
                    //DogController dogController = new DogController(new DogServiceImpl(dog));
                    System.out.println("이름이 무엇입니까?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까?");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "33":
                    dogController.show();
                    break;
                case "4":
                    System.out.println("자전거를 실행합니다.");
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("현재 기어는 몇단입니까?");
                    bicycle.setGear(scanner.nextInt());
                    System.out.println("자전거 제조사는 어디입니까?");
                    bicycle.setCompany(scanner.next());
                    System.out.println("현재 속도는 몇입니까?");
                    bicycle.setSpeed(scanner.nextDouble());
                    bicycleController.add(bicycle);
                    break;
                case "44":
                    bicycleController.show();
                    break;
                case "5":
                    System.out.println("날짜를 실행합니다.");
                    new UtilController().today();
                    break;
                case "6":
                    System.out.println("은행을 실행합니다.");
                    BankAccountDTO account = null;
                    while (true) {
                        account = new BankAccountDTO();
                        System.out.printf(" [ %s 메뉴 ] 0. 종료\t1. 입/출금\t2. 계좌 생성\t3. 계좌 번호 목록", account.BANK_NAME);
                        System.out.println();
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("은행을 종료합니다.");
                                return;
                            case "1":
                                System.out.println("얼마를 입금하시겠습니까?");
                                account.setMoney(scanner.nextInt());
                                bankAccountController.deposit(account);
                                System.out.println("잔고는 : " + account.getMoney());
                                System.out.println("얼마를 출금하시겠습니까?");
                                account.setMoney(scanner.nextInt());
                                bankAccountController.withdraw(account);
                                System.out.println("잔고는 : " + account.getBalance());
                            case "2":
                                System.out.println("이름이 무엇입니까?");
                                account.setName(scanner.next());
                                account.setAccountNumber(bankAccountController.createAccountNumber(account));
                                bankAccountController.add(account);
                                break;
                            case "3" :
                                System.out.println("현재 계좌 목록은 다음과 같습니다.");
                                for (String s : bankAccountController.findAllAccountNumber()) {
                                    System.out.println(s + "\n");
                                }
                                break;
                        }
                        break;
                    }
                    break;
                case "66":
                    bankAccountController.show();
                    break;
            }
        }

    }
}
