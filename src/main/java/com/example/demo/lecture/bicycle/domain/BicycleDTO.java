package com.example.demo.lecture.bicycle.domain;

import java.util.Scanner;

//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)
public class BicycleDTO {
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
