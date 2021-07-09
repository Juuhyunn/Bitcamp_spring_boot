package com.example.demo.lecture.math.service;

import com.example.demo.lecture.math.domain.CalculatorDTO;

public interface CalculatorService {
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remind(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculatorDTO);
}
