package org.example.ObserverDP.ObservableServer;

import org.example.ObserverDP.Observers.Observer;

public interface Observable {
    public void add(Observer obj);
    public void remove(Observer obj);
    public void notifyObservers();
    public void setData(int data);
}
