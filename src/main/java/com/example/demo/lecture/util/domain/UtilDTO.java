package com.example.demo.lecture.util.domain;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;
@Data

public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;
    private String todayAndCurrentTime;


}
