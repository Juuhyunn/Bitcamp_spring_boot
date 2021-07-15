package com.example.demo.lecture.dog.controller;

import com.example.demo.lecture.dog.domian.DogDTO;
import com.example.demo.lecture.dog.service.DogService;
import com.example.demo.lecture.dog.service.DogServiceImpl;
import com.example.demo.lecture.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;
public class DogController extends LambdaUtils {
    private final DogService dogService;
    public Scanner scanner;

    public DogController() {
        dogService = new DogServiceImpl();
        scanner = new Scanner(System.in);
    }
    public void dogController(){
        DogDTO dog = new DogDTO();
        print.accept("\n이름이 무엇입니까?\n");
        dog.setName(scanner.next());
        print.accept("\n색깔은 무엇입니까?\n");
        dog.setColor(scanner.next());
        print.accept("\n품종은 무엇입니까?\n");
        dog.setBreed(scanner.next());
        add(dog);
    }
    public void add(DogDTO dog) {
        dogService.add(dog);
    }
    public void show(){
        print.accept("\n강아지의 수 : " + dogService.count());
        List<DogDTO> list = (List<DogDTO>) dogService.show();
        for (DogDTO d : list) {
            print.accept(d.toString()+"\n for문으로 list 출력\n");
        }
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
}
