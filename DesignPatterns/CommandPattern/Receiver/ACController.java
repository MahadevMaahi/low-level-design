package DesignPatterns.CommandPattern.Receiver;

public class ACController {
    boolean isOn = false;
    int temperature = 25;

    public void turnOn() {
        isOn = true;
        System.out.println("AC is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is off");
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is set to " + temperature);
    }
}
