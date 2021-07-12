package com.example.demo.lecture.util.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;
    private String todayAndCurrentTime;

    public void setToday(LocalDate today) {
        this.today = today;
    }
    public LocalDate getToday() {
        return today;
    }
    public void setTimeNow(LocalTime currentTime) {
        this.currentTime = currentTime;
    }
    public LocalTime getTimeNow() {
        return currentTime;
    }
    public void setTodayAndCurrentTime(String todayAndCurrentTime) {
        this.todayAndCurrentTime = todayAndCurrentTime;
    }
    public String getTodayAndCurrentTime() {
        return todayAndCurrentTime;
    }
}
