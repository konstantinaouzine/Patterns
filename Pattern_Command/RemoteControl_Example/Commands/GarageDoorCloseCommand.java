package Patterns.Pattern_Command.RemoteControl_Example.Commands;

import Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.closeDoor();
    }

    @Override
    public void undo() {
        garageDoor.openDoor();
    }
}
