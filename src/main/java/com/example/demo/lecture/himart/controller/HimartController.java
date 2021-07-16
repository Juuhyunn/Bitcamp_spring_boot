package com.example.demo.lecture.himart.controller;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.bank.service.BankAccountService;
import com.example.demo.lecture.bank.service.BankAccountServiceImpl;
import com.example.demo.lecture.himart.domain.PhoneApp;
import com.example.demo.lecture.util.service.LambdaUtils;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;

import java.util.List;
import java.util.Scanner;

public class HimartController extends LambdaUtils{
    private BankAccountService bankAccountService;
    private BankAccountDTO account;
    private UtilService utilService;

    public HimartController() {
        this.bankAccountService = new BankAccountServiceImpl();
        utilService = new UtilServiceImpl();
    }
    public void himart() {
        Scanner scanner = new Scanner(System.in);
        account = null;
        while (true) {
            print.accept("\n[ 하이마트 메뉴 ] 0. 종료\t1. 스마트폰 구입\t2. ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    print.accept("스마트폰 메뉴를 실행합니다.");
                    phoneMain(scanner);
                    break;
            }
        }
    }
    public void phoneMain(Scanner scanner) { // 파라미터에 Scanner를 쓴 이유는 위에 scanner의 기능을 받아오기 위해서!
        PhoneApp phoneApp = new PhoneApp();
        PhoneApp.Phone phone = null;
        PhoneApp.CelPhone celPhone = null;
        PhoneApp.IPhone iPhone = null;
        PhoneApp.GalaxyNote galaxyNote = null;
        while (true) {
            print.accept("\n[ 스마트폰 메뉴 ] 0. 종료\t1. 집전화\t2. 휴대폰\t3. 아이폰\t4. 갤럭시 ");
            switch (scanner.next()) {
                case "0":
                    print.accept("스마트폰 메뉴를 종료합니다.");
                    break;
                case "1":
                    print.accept("집 전화 메뉴를 실행합니다.\n");
                    phone = phoneApp.new Phone();
                    print.accept("\n종류를 입력하세요");
                    phone.setKind(scanner.next());
                    print.accept("\n제조사를 입력하세요");
                    phone.setCompany(scanner.next());
                    print.accept("\n전화 여부를 입력하세요");
                    phone.setCall(scanner.next());
                    print.accept(phone.toString());
                    break;
                case "2":
                    print.accept("\n휴대폰 메뉴를 실행합니다.");
                    celPhone = phoneApp.new CelPhone();
                    print.accept("\n종류를 입력하세요");
                    celPhone.setKind(scanner.next());
                    print.accept("\n제조사를 입력하세요");
                    celPhone.setCompany(scanner.next());
                    print.accept("\n전화 여부를 입력하세요");
                    celPhone.setCall(scanner.next());
                    celPhone.isPortable();
                    print.accept("\n이동 방법?을 입력하세요");
                    celPhone.setMove(scanner.next());
                    print.accept(celPhone.toString());
                    break;
                case "3":
                    print.accept("\n아이폰 메뉴를 실행합니다.");
                    iPhone = phoneApp.new IPhone();
                    print.accept("\n종류를 입력하세요");
                    iPhone.setKind(scanner.next());
                    iPhone.setCompany(PhoneApp.IPhone.BRAND);
                    print.accept("\n전화 여부를 입력하세요");
                    iPhone.setCall(scanner.next());
                    iPhone.isPortable();
                    print.accept("\n이동 방법을 입력하세요");
                    iPhone.setMove(scanner.next());
                    print.accept("\n검색 방법을 입력하세요");
                    iPhone.setInternet(scanner.next());
                    print.accept(iPhone.toString());
                    break;
                case "4":
                    print.accept("\n갤럭시 메뉴를 실행합니다.");
                    galaxyNote = phoneApp.new GalaxyNote();
                    print.accept("\n종류를 입력하세요");
                    galaxyNote.setKind(scanner.next());
                    galaxyNote.setCompany(PhoneApp.GalaxyNote.BRAND);
                    print.accept("\n전화 여부를 입력하세요");
                    galaxyNote.setCall(scanner.next());
                    print.accept("\n이동 방법?을 입력하세요");
                    galaxyNote.setMove(scanner.next());
                    print.accept("\n검색 방법을 입력하세요");
                    galaxyNote.setInternet(scanner.next());
                    print.accept("\n펜슬을 입력하세요");
                    galaxyNote.setPencil(scanner.next());
                    print.accept(galaxyNote.toString());
                    break;
            }
        }
    }
}

