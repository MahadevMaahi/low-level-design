package DesignPatterns.CommandPattern.Command;

import DesignPatterns.CommandPattern.Receiver.ACController;

public class TurnOnCommand implements ICommand {

    ACController acController;

    public TurnOnCommand(ACController acController) {
        this.acController = acController;
    }

    @Override
    public void execute() {
        acController.turnOn();
    }

    @Override
    public void undo() {
        acController.turnOff();
    }   
    
}
