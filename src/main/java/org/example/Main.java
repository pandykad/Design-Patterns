package org.example;

import org.example.ObserverDP.ObservableServer.Observable;
import org.example.ObserverDP.ObservableServer.ObservableImplementation;
import org.example.ObserverDP.Observers.EmailOberver;
import org.example.ObserverDP.Observers.SMSObserver;


public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Mpv();
//        vehicle.drive();
        Observable server = new ObservableImplementation();
        server.add(new EmailOberver(server));
        server.add(new SMSObserver(server));

        server.setData(100);
        server.setData(10);
    }
}