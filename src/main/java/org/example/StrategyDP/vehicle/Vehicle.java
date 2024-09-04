package org.example.StrategyDP.vehicle;

import org.example.StrategyDP.strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy obj;

    protected Vehicle(DriveStrategy obj){
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}
