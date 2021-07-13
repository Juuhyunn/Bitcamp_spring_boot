package com.example.demo.lecture.math.service;

import com.example.demo.lecture.math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remind(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }

    @Override
    public int[] sequence(CalculatorDTO calculatorDTO) {
        int count = calculatorDTO.getNum2() - calculatorDTO.getNum1();
        int[] arr = new int[count];
        int i = 0;
        for (int j = calculatorDTO.getNum1(); j < calculatorDTO.getNum2(); j++) {
            arr[i] = j;
            i++;
        }
        //while () {//statements (while loop) 기본형
        // }
        return arr;
    }
}