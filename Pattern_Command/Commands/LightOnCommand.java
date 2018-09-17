package Patterns.Pattern_Command.Commands;

import Patterns.Pattern_Command.Receivers_Of_Commands.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        this.light.lightTurnOn();
    }

    @Override
    public void undo() {
        this.light.lightTurnOFF();
    }
}
