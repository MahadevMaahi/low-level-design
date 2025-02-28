package DesignPatterns.CommandPattern.Client;

import DesignPatterns.CommandPattern.Command.ICommand;
import DesignPatterns.CommandPattern.Command.TurnOnCommand;
import DesignPatterns.CommandPattern.Invoker.Invoker;
import DesignPatterns.CommandPattern.Receiver.ACController;

public class Client {
    public static void main(String[] args) {
        ACController acController = new ACController();
        ICommand turnOnCommand = new TurnOnCommand(acController);

        Invoker invoker = new Invoker();

        invoker.setCommand(turnOnCommand);
        invoker.executeCommand();
        invoker.undoCommand();
    }
}
