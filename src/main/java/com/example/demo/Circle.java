package com.example.demo;

public class Circle {
    final double PI = 3.141592;
    double radius;
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
    public double area02(Circle cir) {
        double result = PI*cir.radius*cir.radius;
        return result;
    }
}

class CircleTest{
    public static void main(String[] args) {
        //첫 번째 방법
        Circle c1 = new Circle();
        System.out.println(c1.area01(5.0));

        //두 번째 방법
        Circle c2 = new Circle(5.0);
        System.out.println(c1.area02(c2));
    }
}