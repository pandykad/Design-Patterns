package org.example;

import org.example.StrategyDP.mpv.Mpv;
import org.example.StrategyDP.vehicle.Vehicle;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Mpv();
        vehicle.drive();
        }
}