package DesignPatterns.CommandPattern.Invoker;

import java.util.Stack;

import DesignPatterns.CommandPattern.Command.ICommand;

public class Invoker {

    private ICommand command;
    private Stack<ICommand> commandHistory = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command == null) {
            System.out.println("No command to execute");
            return;
        }
        command.execute();
        commandHistory.push(command);
    }
    
    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo");
        }
    }
}
