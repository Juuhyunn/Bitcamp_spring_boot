package com.example.demo.lecture.math.controller;

import com.example.demo.lecture.math.domain.CalculatorDTO;
import com.example.demo.lecture.math.service.CalculatorService;
import com.example.demo.lecture.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //인스턴스 변수 선언, "모델"을 가지고 있는 인스턴스 변수
        CalculatorDTO calculator = new CalculatorDTO();
        //인터페이스 타입으로 인스턴스 변수 선언, "기능"을 가지고 있는 인스턴스 변수
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("숫자 1?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자?");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2?");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()) {
            case "+" :
                result = calculatorService.add(calculator);
                break;
            case "-" :
                result = calculatorService.subtract(calculator);
                break;
            case "*" :
                result = calculatorService.multiple(calculator);
                break;
            case "/" :
                result = calculatorService.divide(calculator);
                break;
            case "%" :
                result = calculatorService.remind(calculator);
                break;
        }
        //System.out.println(calculator.toString() + result);
        System.out.printf("%d %s %d = %d", calculator.getNum1(), calculator.getOpcode(), calculator.getNum2(),result);
    }
}