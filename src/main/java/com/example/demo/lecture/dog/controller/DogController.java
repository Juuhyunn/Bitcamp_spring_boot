package com.example.demo.lecture.dog.controller;

import com.example.demo.lecture.dog.domian.DogDTO;
import com.example.demo.lecture.dog.service.DogService;
import com.example.demo.lecture.dog.service.DogServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DogController{
    private final DogService dogService;

    public DogController() {
        this.dogService = new DogServiceImpl();
    }

    public void add(DogDTO dog) {
        dogService.add(dog);
    }
    public void show(){
        System.out.println("강아지의 수 : " + dogService.count());
        System.out.println(dogService.show());
    }
    public String barking(String bark) {
        return dogService.barking(bark);
    }
    public String fetching(String target) {
        return dogService.fetching(target);
    }
    public String wagging() {
        return "꼬리를 흔든다";
    }
    /* 임플리먼트 안했을 때
    private Scanner scanner;
    private DogDTO dog;

    public DogController() {
        this.scanner = new Scanner(System.in);
        this.dog = new DogDTO(); //dog가 인스턴스
    }

    public void dog(){
        System.out.println("이름이 무엇입니까?");
        //String name = scanner.next();
        dog.setName(scanner.next());
        System.out.println("색깔은 무엇입니까?");
        //String color = scanner.next();
        dog.setColor(scanner.next());
        System.out.println("품종은 무엇입니까?");
        //String breed = scanner.next();
        dog.setBreed(scanner.next());
        System.out.println("배고픕니까?");
        //String hungry = scanner.next();
        dog.setHungry(scanner.next());
        //System.out.printf("이름은 %s이고, 색깔은 %s이고, 품종은 %s이고, 배고픔은 %s입니다.",name, color, breed, hungry);
        //System.out.printf("이름은 %s이고, 색깔은 %s이고, 품종은 %s이고, 배고픔은 %s입니다.",dog.getName(),dog.getColor(),dog.getBreed(),dog.getHungry());
        System.out.println(dog.toString());
    }
     */
}
