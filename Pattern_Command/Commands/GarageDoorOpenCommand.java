package Patterns.Pattern_Command.Commands;

import Patterns.Pattern_Command.Receivers_Of_Commands.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.openDoor();
    }

    @Override
    public void undo() {
        garageDoor.closeDoor();
    }
}
