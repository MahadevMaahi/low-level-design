package DesignPatterns.SingletonPattern;

public class SingletonClient {
    public static void main(String[] args) {
        DBConnection singleton1 = DBConnection.getInstance();
        DBConnection singleton2 = DBConnection.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
