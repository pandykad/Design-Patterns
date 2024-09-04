package org.example.ObserverDP.Observers;

import org.example.ObserverDP.ObservableServer.Observable;

public class SMSObserver implements Observer {
    Observable obj;

    public SMSObserver(Observable obj){
        this.obj = obj;
    }

    @Override
    public void update() {
        System.out.println("SMS notification received!");
    }
}
