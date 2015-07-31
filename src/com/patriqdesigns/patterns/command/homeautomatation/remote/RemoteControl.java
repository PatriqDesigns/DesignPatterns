package com.patriqdesigns.patterns.command.homeautomatation.remote;

import com.patriqdesigns.patterns.command.homeautomatation.LimitedStack;
import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.command.DefaultCommand;

/**
 * Created by Andre on 20/07/15.
 */
public class RemoteControl {

    private static final int SLOTS_NUM = 7;
    private static final int UNDO_LIMIT = 10; //because is a remote, doesnt have much memory.

    private Command[] onCommands;
    private Command[] offCommands;
    private LimitedStack<Command> lastCommands;

    public RemoteControl() {
        onCommands = new Command[SLOTS_NUM];
        offCommands = new Command[SLOTS_NUM];
        lastCommands = new LimitedStack<Command>(UNDO_LIMIT);

        Command defaultCommand = new DefaultCommand();
        for (int i = 0; i < SLOTS_NUM; i++) {
            onCommands[i] = defaultCommand;
            offCommands[i] = defaultCommand;
        }
        lastCommands.push(defaultCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot - 1] = onCommand;
        offCommands[slot - 1] = offCommand;
    }

    public void onButtonPressed(int slot) {
        lastCommands.push(onCommands[slot - 1]).execute();
    }

    public void offButtonPressed(int slot) {
        lastCommands.push(offCommands[slot - 1]).execute();
    }

    public void undoButtonPressed() {
        lastCommands.pop().undo();
        if (lastCommands.isEmpty()) {
            lastCommands.push(new DefaultCommand());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\n------ Remote Control -------\n");
        for (int i = 0; i < SLOTS_NUM; i++) {
            builder.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("   ")
                    .append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        builder.append("[undo] ")
                .append(lastCommands.peek().getClass().getSimpleName())
                .append("\n");
        return builder.toString();
    }
}
