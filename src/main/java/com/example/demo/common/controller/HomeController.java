package com.example.demo.common.controller;

import com.example.demo.lecture.bank.controller.BankAccountController;
import com.example.demo.lecture.bicycle.controller.BicycleController;
import com.example.demo.lecture.dog.controller.DogController;
import com.example.demo.lecture.himart.controller.HimartController;
import com.example.demo.lecture.math.controller.CalculatorController;
import com.example.demo.lecture.util.controller.UtilController;
import com.example.demo.lecture.util.service.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();
        while (true) {
            print.accept("\n==========================================================================");
            print.accept("\n[Navigation] 0. 종료\t1. 계산기\t2. 수열\t3. Dog\t4. Bicycle\t5. 하이마트\t6. 은행\t");
            print.accept("\n==========================================================================\n");
            switch (scanner.next()) {
                case "0":
                    print.accept("\n종료합니다.");
                    return;
                case "1":
                    print.accept("\n계산기가 실행됩니다\n");
                    new CalculatorController().calculate();
                    break;
                case "2":
                    print.accept("\n수열이 실행됩니다.\n");
                    new CalculatorController().sequence();
                    break;
                case "3":
                    print.accept("\nDog를 실행합니다.\n");
                    new DogController().dogController();
                    break;
                case "33":
                    dogController.show();
                    break;
                case "4":
                    print.accept("\n자전거를 실행합니다.\n");
                    new BicycleController().bicycle();
                    break;
                case "44":
                    bicycleController.show();
                    break;
                case "5":
                    print.accept("\n하이마트 메뉴를 실행합니다.\n");
                    new HimartController().himart();
                    break;
                case "6":
                    print.accept("\n은행을 실행합니다.\n");
                    new BankAccountController().bank();
                    break;
            }
        }
    }
}
