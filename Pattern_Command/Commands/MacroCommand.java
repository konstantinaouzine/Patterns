package Patterns.Pattern_Command.Commands;

import java.util.ArrayList;
import java.util.Arrays;

//Macro command will be used to control multiple devices by one button
public class MacroCommand implements Command {
    ArrayList<Command> commands;

    public MacroCommand(Command... commandsList)
    {
        this.commands = new ArrayList<>(Arrays.asList(commandsList));
    }

    @Override
    public void execute() {
        for (Command command : commands)
            command.execute();
    }

    @Override
    public void undo() {
        for (Command command : commands)
            command.undo();
    }
}
