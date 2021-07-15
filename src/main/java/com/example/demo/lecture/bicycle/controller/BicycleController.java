package com.example.demo.lecture.bicycle.controller;


import com.example.demo.lecture.bicycle.domain.BicycleDTO;
import com.example.demo.lecture.bicycle.service.BicycleService;
import com.example.demo.lecture.bicycle.service.BicycleServiceImpl;
import com.example.demo.lecture.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicycleController extends LambdaUtils {
    private Scanner scanner;
    private BicycleService bicycleService;

    public BicycleController() {
        this.scanner = new Scanner(System.in);
        this.bicycleService = new BicycleServiceImpl();
    }
    public void bicycle() {
        BicycleDTO bicycle = new BicycleDTO();
        print.accept("\n현재 기어는 몇단입니까?\n");
        bicycle.setGear(scanner.nextInt());
        print.accept("\n자전거 제조사는 어디입니까?\n");
        bicycle.setCompany(scanner.next());
        print.accept("\n현재 속도는 몇입니까?\n");
        bicycle.setSpeed(scanner.nextDouble());
        add(bicycle);
    }
    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }
    public void show() {
        print.accept(" \n자전거 수 : " + bicycleService.count());
        List<BicycleDTO> list = bicycleService.show();
        for (BicycleDTO b : list) {
            print.accept(b.toString());
        }
    }
}
