package com.example.demo.practice;

public class Gugudan {
    public static void main(String[] args){
        //구구단
        for(int i = 1; i < 10; i++){
            System.out.println("\n" + i + "단 :");
            for (int j = 1; j < 10; j++) {
                int result = i*j;
                System.out.println(i + " X " + j + " = " + result);
            }
        }
    }
}