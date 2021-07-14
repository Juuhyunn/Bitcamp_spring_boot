package com.example.demo.lecture.dog.service;
//barking, fetching, wagging tail

import com.example.demo.lecture.dog.domian.DogDTO;

import java.util.List;

public interface DogService {
    void add(DogDTO dog);
    int count();
    List<?> show();
    //인터페이스에는 속성이 있으면 안된다.
    public String barking(String bark); //기능 정의. 속성값이 없으니까 파라미터가 없슴.
    public String fetching(String target);
    public String waggingTail();



}
