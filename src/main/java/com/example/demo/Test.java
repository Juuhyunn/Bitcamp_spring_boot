package com.example.demo;

public class Test {
        public static void main(String[] args) {
            int i = 0;
            int sum01 = 0;
            int sum02 = 0;
            //while문
            while (i < 100) {
                i ++;
                sum01 += i;
            }
            System.out.println("while문 : " + sum01);
            //for문
            for(int j = 1; j <= 100; ++j){
                sum02 += j;
            }
            System.out.println("for문 : " + sum02);
        }
    }