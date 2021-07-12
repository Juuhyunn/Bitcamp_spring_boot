package com.example.demo.common.controller;

import com.example.demo.lecture.bicycle.controller.BicycleCotroller;
import com.example.demo.lecture.dog.controller.DogController;
import com.example.demo.lecture.math.controller.CalculatorController;
import com.example.demo.lecture.util.controller.UtilController;
import com.example.demo.lecture.util.domain.UtilDTO;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicycleCotroller bicycleCotroller = new BicycleCotroller();
        UtilController utilController = new UtilController();
        while (true) {
            System.out.println("\n=====================================================================");
            System.out.println(" [메뉴] 0. 종료\t1. 계산기\t2. 수열\t3. Dog\t4. Bicycle\t5. 오늘 날짜");
            System.out.println("=====================================================================");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료합니다.");
                    return;
                case "1" :
                    System.out.println("계산기가 실행됩니다");
                    calculatorController.calculate();
                    break;
                case "2" :
                    System.out.println("수열이 실행됩니다.");
                    calculatorController.sequence();
                    break;
                case "3" :
                    System.out.println("Dog를 실행합니다.");
                    dogController.dog();
                    break;
                case "4" :
                    System.out.println("자전거를 실행합니다.");
                    bicycleCotroller.bicycle();
                    break;
                case "5" :
                    System.out.println("날짜를 실행합니다.");
                    utilController.today();
                    break;
            }
        }
    }
}
