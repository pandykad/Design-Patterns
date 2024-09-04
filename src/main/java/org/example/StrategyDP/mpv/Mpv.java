package org.example.StrategyDP.mpv;

import org.example.StrategyDP.strategy.NormalDS;
import org.example.StrategyDP.vehicle.Vehicle;

public class Mpv extends Vehicle {
    public Mpv() {
        super(new NormalDS());
    }

//    @Override
//    public void drive() {
//        super.drive();
//        System.out.println("I am a MPV!");
//    }
}
