package Patterns.Pattern_Command.RemoteControl_Example.Commands;

import Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands.Stereo;

public class StereoTurnOnCommand implements Command {
    private Stereo stereo;

    public StereoTurnOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.stereoTurnOn();
        stereo.setCD();
        stereo.setVolumeToNormal();
    }

    @Override
    public void undo() {
        stereo.stereoTurnOFF();
    }
}
