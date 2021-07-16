package com.example.demo.lecture.util.service;

import com.example.demo.lecture.bank.domain.BankAccountDTO;
import com.example.demo.lecture.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{
    private UtilDTO utilDTO;

    public UtilServiceImpl() {
        this.utilDTO = new UtilDTO();
    }

    @Override
    public LocalDate getLocalDate() {
        utilDTO.setToday(LocalDate.now());
        return utilDTO.getToday();
    }

    @Override
    public LocalTime getLocalTime() {
        utilDTO.setCurrentTime(LocalTime.now());
        return utilDTO.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s\t%s", getLocalDate(),getLocalTime());
    }

    @Override
    public String randomNumbers(int digits, boolean allowZeroValue) {
        //math.random() --> 클래스 메소드
        //Random random = new Random(); : 한 번만 쓴다. 한 번만 사용할 때 효율적이다.
        //random.nextInt(1000); 인스턴스 메소드 : 여러 번 쓸 수 있다. 사용할 때 마다 메모리 차지함.
        String result = "", first = "";
        first += allowZeroValue ? ((int) (Math.random() * 10)) : ((int)(Math.random() * 9 + 1));
        for (int i = 0; i<digits - 1 ; i++) {
            result += (int)(Math.random() * 10) ;
        }
        return first + result;//리턴은 위에 있을 수록 성능이 좋다.
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
