package com.example.demo;

public class Pyramid {
    public static void main(String[] args){
         for(int i = 0; i < 5; i++) {
            int a;
            int b;
            for (a = 0; a < 5;a++){
            System.out.print(".");
        }
        System.out.println();
        for(int j = 10; j > 0; j--) {

            }
         }

         int score = 0;
         char grade = '';
         switch (score) {
             case 90 : //case는 책갈피와 같다.
                 grade = 'A';
                 break; // switch문 탈출!
             case 80 :
                 grade = 'B';
                 //여기 break문이 없으면 다음 case도 읽음
             case 70 :
                 grade = 'C';
         }
}
