package com.example.demo.lecture.bicycle.controller;


import com.example.demo.lecture.bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController {
    private Scanner scanner;
    private BicycleDTO bicycle;

    public BicycleController() {
        this.scanner = new Scanner(System.in);
        this.bicycle = new BicycleDTO();
    }
    public void bicycle(){
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
