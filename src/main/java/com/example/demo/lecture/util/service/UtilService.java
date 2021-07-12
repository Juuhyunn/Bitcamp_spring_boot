package com.example.demo.lecture.util.service;

import com.example.demo.lecture.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    LocalDate getLocalDate();
    LocalTime getLocalTime();
    String todayAndCurrentTime();
    //LocalDate getLocalDate(UtilDTO utilDTO);
    //LocalTime getLocalTime(UtilDTO utilDTO);
}
