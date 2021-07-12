package com.example.demo.lecture.util.controller;

import com.example.demo.lecture.util.domain.UtilDTO;
import com.example.demo.lecture.util.service.UtilService;
import com.example.demo.lecture.util.service.UtilServiceImpl;

public class UtilController {
    public void today(){
        UtilDTO utilDTO = new UtilDTO();
        UtilService utilService = new UtilServiceImpl();
        System.out.println("오늘의 날짜는?");
        System.out.println(utilService.todayAndCurrentTime());
        //utilService.getLocalDate(utilDTO);
        //utilService.getLocalTime(utilDTO);
        //System.out.println(utilDTO.getToday() + "\t" + utilDTO.getTimeNow());
    }
}
