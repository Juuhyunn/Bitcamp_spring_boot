package com.example.demo;

//상속
class SmartTv extends Object{
    int number;
    // extends를 통해 상속을 하면 상속 대상의 변수를 재사용할 수 있음.
    // 기본적으로는 Object 클래스에 상속되어 있음. (생략됨)


    @Override
    public String toString() {
       // return super.toString(); --> 원래 부모 클래스의 toString 함수 내용
        System.out.println("오버 라이딩 메소드"); //--> 내가 오버라이딩 하려는 내용
        return "리턴값이 필요해";
    }
}


class TvControl {
    public static void main(String[] args) {
        //TV 켜기
        Television lg_tv = new Television("LG전자");
        Television sam_tv = new Television("SAMSUNG");
        Television hp_tv = new Television("hp",2048);
        //System.out.println(hp_tv.resolution);

        /*
        //current_channel이 private으로 선언되면 사용 못하는 코드
        System.out.println(hp_tv.current_channel);
        hp_tv.current_channel = 11;
        System.out.println(hp_tv.current_channel);
        */

        //변수가 private인 경우 사용하려면 getter와 setter를 사용해야함함
       //실제 데이터가 들어있는 것은 getter
        //데이터 저장 등을 위해 주소값이 들어 있는 것은 setter
        /*
        hp_tv.setCurrent_channel(11);
        System.out.println(hp_tv.getCurrent_channel());
        hp_tv.setCurrent_channel(1111);
        System.out.println(hp_tv.getCurrent_channel());
         */


        hp_tv.setCurrent_channel(11);
        hp_tv.setCurrent_channel(1111);

        //볼륨 키우기

        //채널 바꾸기
        /*
        System.out.println("얘는 getter로 가져온 주소(시작)값 : " + hp_tv.getChannel());
        int[] arr = hp_tv.getChannel();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            //Thread.sleep(500);
        }
        */
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

    int password;
    static void display(){

    }


    //getter and setter
    //

    //조회용 : setter를 통해 setting된 값이 반환됨
    public int[] getChannel() {
        return channel;
    }

    //저장용 : 참조변수(channel)의 주소값을 setting 함.
    // 주소의 시작 값을 알아야 찾아 들어가니까?

    public void setChannel(int[] channel) {
        this.channel = channel;
    }


    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        //예외 처리를 위한 코드. (제어문)
        if(current_channel > 100){
            System.out.println(" 입력 오류 : 없는 채널입니다.");
        }
        //예외가 아닌 정상이면 실행 되는 코드
        else {
            this.current_channel = current_channel;
            System.out.println(current_channel);
        }
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
