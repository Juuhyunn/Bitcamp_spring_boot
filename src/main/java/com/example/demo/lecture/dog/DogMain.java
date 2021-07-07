package com.example.demo.lecture.dog;

//state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

class Dog { // 중괄호 안은 메모리 영역
    //멤버 변수
    //private으로 보안
    private String name;
    private String color;
    private String breed;
    private String hungry;

    //멤버 함수
    //getter(supplier) 와 setter(consumer) 만들기
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name; //this는 멤버변수를 가리킨다.
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return this.getBreed();
    }
    public void setHungry(String hungry) {
        this.hungry = hungry;
    }
    public String getHungry() {
        return this.getHungry();
    }

    @Override
    public String toString() {
        return String.format("이름은 %s이고, 색깔은 %s이고, 품종은 %s이고, 배고픔은 %s입니다.",name,color,breed,hungry);
    }
}
public class DogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog(); //dog가 인스턴스
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
}
