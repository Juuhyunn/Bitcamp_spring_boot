package com.example.demo.lecture.bicycle;

import java.util.Scanner;

//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)
class Bicycle {
    private int gear;
    private String company;
    private double speed;

    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getGear() {
        return this.gear;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return this.company;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed; //해당되는 변수가 하나밖에 없으니까 this는 생략이 가능하다.
    }

    @Override
    public String toString() {
        return String.format("현재 자전거의 기어는 %d단이고, 제조사는 %s이고, 속도는 %f입니다.", getGear(), getCompany(),getSpeed());
    }
}
public class BicycleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle();
        System.out.println("현재 기어는 몇단입니까?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("자전거 제조사는 어디입니까?");
        bicycle.setCompany(scanner.next());
        System.out.println("현재 속도는 몇입니까?");
        bicycle.setSpeed(scanner.nextDouble());
        //System.out.printf("현재 자전거의 기어는 %d단이고, 제조사는 %s이고, 속도는 %f입니다.", bicycle.getGear(),bicycle.getCompany(),bicycle.getSpeed());
        System.out.print(bicycle.toString());
    }
}