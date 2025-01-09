package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    private StockObservable observable;
    private String mobileNumber;

    public MobileAlertObserver(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsg(mobileNumber, "Product is available hurry up!");
    }

    private void sendMsg(String mobileNumber, String description) {
        System.out.println("Msg sent to " + mobileNumber + "with description " + description);
    }
    
}

