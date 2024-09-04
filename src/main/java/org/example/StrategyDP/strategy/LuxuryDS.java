package org.example.StrategyDP.strategy;

public class LuxuryDS implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("I am luxury vehicle!");
    }
}
