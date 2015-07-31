package com.patriqdesigns.patterns.command.homeautomatation.command;

/**
 * Created by Andre on 20/07/15.
 */
public class DefaultCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Not implemented.");
    }

    @Override
    public void undo() {
        System.out.println("There is nothing to undo.");
    }
}
