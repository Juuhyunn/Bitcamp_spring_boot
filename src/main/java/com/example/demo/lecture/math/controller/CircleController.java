package com.example.demo.lecture.math.controller;

import com.example.demo.lecture.math.domain.CircleDTO;

import java.util.Scanner;

public class CircleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircleDTO circle = new CircleDTO();
        System.out.println("원의 반지름을 입력하세요");
        circle.setRadius(scanner.nextDouble());
        circle.area(circle.getRadius());
        System.out.println(circle.toString());
        /*
        //첫 번째 방법
        Circle circle1 = new Circle();
        System.out.println(circle1.area01(5.0));

        //두 번째 방법
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2.area02(c2));
        */
    }
}
