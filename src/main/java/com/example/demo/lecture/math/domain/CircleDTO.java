package com.example.demo.lecture.math.domain;

public class CircleDTO {
    final private double PI = 3.141592;
    private double radius;
    private double result;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public double getResult() {
        return result;
    }
    public void area(double radius) {
        result = PI*radius*radius;
    }

    @Override
    public String toString() {
        return String.format("반지름이 %f인 원의 넓이는 %f이다.",radius,result);
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
