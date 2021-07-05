package com.example.demo;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper;
import sun.security.rsa.RSAUtil;

import javax.swing.*;
import java.util.Scanner;


public class Myobject {

    public static void main(String[] args){
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2,num3);

        char a = '1'; // 스칼라 (scalar) - 단수
        String a2 = "1"; // 벡터 (vector) - 복수
    }
}

