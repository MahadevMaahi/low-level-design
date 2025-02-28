package DesignPatterns.CommandPattern.Command;

import DesignPatterns.CommandPattern.Receiver.ACController;

public class TurnOffCommand implements ICommand {

    ACController acController;

    public TurnOffCommand(ACController acController) {
        this.acController = acController;
    }

    @Override
    public void execute() {
        acController.turnOff();
    }

    @Override
    public void undo() {
        acController.turnOn();
    }
    
}
