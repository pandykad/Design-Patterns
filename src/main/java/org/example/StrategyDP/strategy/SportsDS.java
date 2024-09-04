package org.example.StrategyDP.strategy;

import org.example.StrategyDP.strategy.DriveStrategy;

public class SportsDS implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("I am a sports vehicle!");
    }
}
