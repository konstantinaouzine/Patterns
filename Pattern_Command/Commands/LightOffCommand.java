package Patterns.Pattern_Command.Commands;

import Patterns.Pattern_Command.Receivers_Of_Commands.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        this.light.lightTurnOFF();
    }

    @Override
    public void undo() {this.light.lightTurnOn(); }
}
