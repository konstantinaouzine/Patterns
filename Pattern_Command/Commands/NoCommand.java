package Patterns.Pattern_Command.Commands;

public class NoCommand implements Command {
    //Empty funtion - using pattern - Null Object
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
