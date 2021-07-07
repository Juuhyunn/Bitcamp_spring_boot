package com.example.demo.practice;

public class Gugudan02 {
    public static void main(String[] args){
        //구구단
        for(int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++) {
                int result = i*j;
                System.out.print(j + " X " + i + " = " + result + "\t");
            }
            System.out.println();
        }
    }
}