package com.example.demo.lecture.util.controller;

import com.example.demo.lecture.util.service.LambdaUtils;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;

public class UtilController extends LambdaUtils {
    private UtilService utilService;
    public UtilController(){
        this.utilService = new UtilServiceImpl();
    }

    public void today(){
        print.accept("\n오늘의 날짜는?\n");
        print.accept(utilService.todayAndCurrentTime());
    }
}