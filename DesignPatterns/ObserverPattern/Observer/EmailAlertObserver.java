package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private StockObservable observable;
    private String emailId;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is available hurry up!");
    }

    private void sendMail(String emailId, String description) {
        System.out.println("Mail sent to " + emailId + "with description " + description);
    }
    
}
