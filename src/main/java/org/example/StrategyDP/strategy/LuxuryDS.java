package org.example.StrategyDP.strategy;

import org.example.StrategyDP.strategy.DriveStrategy;

public class LuxuryDS implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("I am luxury vehicle!");
    }
}
