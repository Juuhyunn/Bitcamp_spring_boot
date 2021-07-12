package com.example.demo.lecture.util.controller;

import com.example.demo.lecture.util.domain.UtilDTO;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;

public class UtilController {
    private UtilService utilService;
    public UtilController(){
        this.utilService = new UtilServiceImpl();
    }
    public void today(){
        System.out.println("오늘의 날짜는?");
        System.out.println(utilService.todayAndCurrentTime());
        //UtilDTO utilDTO = new UtilDTO();
        //utilService.getLocalDate(utilDTO);
        //utilService.getLocalTime(utilDTO);
        //System.out.println(utilDTO.getToday() + "\t" + utilDTO.getTimeNow());
    }
}