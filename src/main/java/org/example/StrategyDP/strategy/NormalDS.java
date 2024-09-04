package org.example.StrategyDP.strategy;

public class NormalDS implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("I am a normal vehicle!");
    }
}
