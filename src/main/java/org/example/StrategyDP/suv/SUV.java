package org.example.StrategyDP.suv;

import org.example.StrategyDP.strategy.SportsDS;
import org.example.StrategyDP.vehicle.Vehicle;

public class SUV extends Vehicle {
    public SUV(){
        super(new SportsDS());
    }
//    @Override
//    public void drive() {
//        super.drive();
//        System.out.println("I am a SUV");
//    }
}
