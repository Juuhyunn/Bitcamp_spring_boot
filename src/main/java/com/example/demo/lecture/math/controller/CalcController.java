package com.example.demo.lecture.math.controller;

import com.example.demo.lecture.math.domain.Calc;

import java.util.Scanner;

public class CalcController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        System.out.println("첫 번째 숫자는?");
        calc.setNum3(scanner.nextInt());
        System.out.println("두 번째 숫자는?");
        calc.setNum4(scanner.nextInt());
        System.out.println("정답은?");
        System.out.println(calc.calculator());
    }
}
