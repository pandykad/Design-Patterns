package org.example.StrategyDP.offroad;

import org.example.StrategyDP.strategy.SportsDS;
import org.example.StrategyDP.vehicle.Vehicle;

public class Offroad extends Vehicle {
    public Offroad() {
        super(new SportsDS());
    }

//    @Override
//    public void drive() {
//        super.drive();
//        System.out.println("I am a offroad vehicle");
//    }
}
