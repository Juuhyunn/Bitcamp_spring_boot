package com.example.demo.practice;

public class Pyramid {
    public static void main(String[] args) {
        String blank = "";
        String star = "";
        int num = 5;

            for (int i = num; i > 0; i--) {
                //System.out.print(a);
                for (int x = i; x > 0; x--) {
                    System.out.print(".");
                    blank += ".";
                }
                for (int x = 0 ; x < num + 1 - i; x++) {
                    System.out.print("*");
                    star += "*";
                }
                System.out.print(star);
                System.out.print(blank);
                blank = "";
                star = "";
                System.out.println();
            }
        }
    }


