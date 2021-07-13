package com.example.demo.lecture.bicycle.controller;


import com.example.demo.lecture.bicycle.domain.BicycleDTO;
import com.example.demo.lecture.bicycle.service.BicycleService;
import com.example.demo.lecture.bicycle.service.BicycleServiceImpl;

import java.util.Scanner;

public class BicycleController {
    private Scanner scanner;
    private BicycleDTO bicycle;
    private BicycleService bicycleService;

    public BicycleController() {
        this.scanner = new Scanner(System.in);
        this.bicycle = new BicycleDTO();
        this.bicycleService = new BicycleServiceImpl();
    }
    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }
    public void show() {
        System.out.println(" 자전거 수 : " + bicycleService.count());
        System.out.println(bicycleService.show());

    }

}
