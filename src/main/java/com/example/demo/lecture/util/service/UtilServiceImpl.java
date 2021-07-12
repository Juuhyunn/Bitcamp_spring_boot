package com.example.demo.lecture.util.service;

import com.example.demo.lecture.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{
    UtilDTO utilDTO = new UtilDTO();
    @Override
    public LocalDate getLocalDate() {
        utilDTO.setToday(LocalDate.now());
        return utilDTO.getToday();
    }

    @Override
    public LocalTime getLocalTime() {
        utilDTO.setTimeNow(LocalTime.now());
        return utilDTO.getTimeNow();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s\t%s", getLocalDate(),getLocalTime());
    }

    /*
    @Override
    public LocalDate getLocalDate(UtilDTO utilDTO) {
        utilDTO.setToday(LocalDate.now());
        return utilDTO.getToday();
    }

    @Override
    public LocalTime getLocalTime(UtilDTO utilDTO) {
        utilDTO.setTimeNow(LocalTime.now());
        return utilDTO.getTimeNow();
    }
    */
}
