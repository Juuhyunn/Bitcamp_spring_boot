package com.example.demo.lecture.math.domain;

public class Circle {
    final private double PI = 3.141592;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    /*
    //첫 번째 방법
    //생성자 만들기
    Circle(){}
    // 원의 넓이 구하는 메소드 만들기
    public double area01(double rad) {
        double result = PI*rad*rad;
        return result;
    }

    //두 번째 방법
    //생성자 만들기
    public Circle(double radius) {
        this.radius = radius;
    }
    // 원의 넓이 구하는 메소드 만들기
    public double area02(com.example.demo.practice.Circle cir) {
        double result = PI*cir.radius*cir.radius;
        return result;
      */
    }
