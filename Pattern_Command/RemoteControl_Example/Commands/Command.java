package Patterns.Pattern_Command.RemoteControl_Example.Commands;

public interface Command {
    void execute();
    void undo();
}
