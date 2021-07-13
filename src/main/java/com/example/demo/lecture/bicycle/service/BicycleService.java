package com.example.demo.lecture.bicycle.service;

import com.example.demo.lecture.bicycle.domain.BicycleDTO;

import java.util.List;

//behavior (changing gear, changing pedal cadence, applying brakes)
public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();
    String changingGear(String changingGear);
    String changingPedal(String changingPedal);
    String applyingBrakes(String applyingBrakes);
}
