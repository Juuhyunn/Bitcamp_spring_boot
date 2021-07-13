package com.example.demo.lecture.dog.service;

import com.example.demo.lecture.dog.domian.DogDTO;

import java.util.ArrayList;
import java.util.List;

public class DogServiceImpl implements DogService {
    private final DogDTO dog;
    private ArrayList<DogDTO> dogs;

    public DogServiceImpl() {
        this.dog = new DogDTO();
        this.dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<DogDTO> show() {
        return dogs;
    }

    //Ctrl + i : 인터페이스 불러오기
    @Override
    public String barking(String bark) {
        return dog.toString() + bark + "짖는다.";
    }

    @Override
    public String fetching(String target) {
        return dog.toString() + target + "을 물어온다.";
    }

    @Override
    public String waggingTail() {
        return "꼬리를 흔든다.";
    }
}
