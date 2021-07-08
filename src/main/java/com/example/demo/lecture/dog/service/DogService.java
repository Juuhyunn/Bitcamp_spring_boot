package com.example.demo.lecture.dog.service;
//barking, fetching, wagging tail
public interface DogService {
    //인터페이스에는 속성이 있으면 안된다.
    public String barking(String bark); //기능 정의. 속성값이 없으니까 파라미터가 없슴.
    public String fetching(String target);
    public String waggingTail();



}
