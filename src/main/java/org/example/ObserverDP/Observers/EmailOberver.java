package org.example.ObserverDP.Observers;

import org.example.ObserverDP.ObservableServer.Observable;

public class EmailOberver implements Observer {
    Observable obj;

    public EmailOberver(Observable obj){
        this.obj = obj;
    }
    @Override
    public void update() {
        System.out.println("Email notifcation recieved for change");
    }
}
