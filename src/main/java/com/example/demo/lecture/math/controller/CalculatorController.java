package com.example.demo.lecture.math.controller;

import com.example.demo.lecture.math.domain.CalculatorDTO;
import com.example.demo.lecture.math.service.CalculatorService;
import com.example.demo.lecture.math.service.CalculatorServiceImpl;
import com.example.demo.lecture.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class CalculatorController extends LambdaUtils {
    //인스턴스 변수 선언, "모델"을 가지고 있는 인스턴스 변수
    private CalculatorDTO calculator;
    //인터페이스 타입으로 인스턴스 변수 선언, "기능"을 가지고 있는 인스턴스 변수
    private CalculatorService calculatorService;
    private Scanner scanner;

    public CalculatorController(){
        this.calculator = new CalculatorDTO();
        this.calculatorService = new CalculatorServiceImpl();
        this.scanner = new Scanner(System.in);
    }

    public void calculate(){
        print.accept("숫자 1?\n");
        calculator.setNum1(scanner.nextInt());
        print.accept("연산자?\n");
        calculator.setOpcode(scanner.next());
        print.accept("숫자 2?\n");
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
        print.accept(calculator.getNum1() + " " + calculator.getOpcode() + " " + calculator.getNum2() + " = " +result); }

    public void sequence(){
        print.accept("수열의 시작 ?\n");
        calculator.setNum1(scanner.nextInt());
        print.accept("수열의 마지막 ?\n");
        calculator.setNum2(scanner.nextInt() + 1);
        int[] arr = calculatorService.sequence(calculator);
        for (int i = 0; i < arr.length; i++) {
            print.accept(arr[i] + "\t");
        }
        print.accept("\n");

    }
}