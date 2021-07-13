package com.example.demo.lecture.bicycle.service;

import com.example.demo.lecture.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{
    private final BicycleDTO bicycle;
    private final ArrayList<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        this.bicycle = new BicycleDTO();
        this.bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }

    @Override
    public String changingGear(String changingGear) {
        return null;
    }

    @Override
    public String changingPedal(String changingPedal) {
        return null;
    }

    @Override
    public String applyingBrakes(String applyingBrakes) {
        return null;
    }
}
