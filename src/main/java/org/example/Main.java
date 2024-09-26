package org.example;

import org.example.ObserverDP.ObservableServer.Observable;
import org.example.ObserverDP.ObservableServer.ObservableImplementation;
import org.example.ObserverDP.Observers.EmailOberver;
import org.example.ObserverDP.Observers.SMSObserver;
import org.example.TicTacToe.Game;


public class Main {
    public static void main(String[] args) {
//        Strategy
//        Vehicle vehicle = new Mpv();
//        vehicle.drive();

//          Observer
//        Observable server = new ObservableImplementation();
//        server.add(new EmailOberver(server));
//        server.add(new SMSObserver(server));
//
//        server.setData(100);
//        server.setData(10);

        Game game = new Game("P1", "P2");
        System.out.println(game.creatGame());
    }

}