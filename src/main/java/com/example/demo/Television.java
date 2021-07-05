package com.example.demo;

class TvControl {
    public static void main(String[] args) {
        //TV 켜기
        Television lg_tv = new Television("LG전자");
        Television sam_tv = new Television("SAMSUNG");
        Television hp_tv = new Television("hp",2048);
        System.out.println(hp_tv.resolution);

        System.out.println(hp_tv.current_channel);
        hp_tv.current_channel = 11;
        System.out.println(hp_tv.current_channel);

        //볼륨 키우기

        //채널 바꾸기
    }

    //함수 오버로딩 (이름을 중복해서 사용할 수 있땨!)
    public int add(int x, int y) {
        return x + y;
    }
    public double add (double x, double y) {
        return x + y;
    }

}


public class Television {
    //속성
    String model_name;
    int[] channel; //int형 배열 선언
    private int current_channel;
    int resolution;
    boolean power;

    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        this.current_channel = current_channel;
    }

    Television(){}

    //생성자
    Television(String tv_name){
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100]; //100개 만들기 : channel[0]부터 [99]까지 만들어짐
        for(int i = 0; i < channel.length; i++) {
            channel[i] = i + 1;
        }
    }


    //생성한 객체의 주소를 반환. ?? this는 자기 자신의 주소를 반환하는 것.

   Television(String tv_name, int resolution){
        model_name = tv_name;
        this.resolution = resolution; //this.
        power = false;
        current_channel = 0;
        channel = new int[100]; //100개 만들기 : channel[0]부터 [99]까지 만들어짐
        for(int i = 0; i < channel.length; i++) {
            channel[i] = i + 1;
        }
    }


    //기능
    //
    boolean onOff(){
        System.out.println("TV on ~~~");
        return power;
    }

}
