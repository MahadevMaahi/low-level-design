package DesignPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class IPhoneObservable implements StockObservable {

    private List<NotificationAlertObserver> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setCount(int count) {
        if (stockCount == 0) {
            notifyObserver();
        }
        stockCount = stockCount + count;
    }

    @Override
    public int getCount() {
        return stockCount;
    }
    
}
