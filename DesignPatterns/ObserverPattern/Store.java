package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IPhoneObservable;
import DesignPatterns.ObserverPattern.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserver;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserver;

public class Store {

    public static void main(String args[]) {
    
        StockObservable stockObservable = new IPhoneObservable();
    
        NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", stockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xyz@gmail.com", stockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("+919XXXXXXXX5", stockObservable);

        stockObservable.setCount(0);

        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.add(observer3);

        stockObservable.setCount(10);
    }
}
