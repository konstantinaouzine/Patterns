package Patterns.Pattern_Command.RemoteControl_Example.Commands;

import Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands.Stereo;

public class StereoTurnOffCommand implements Command {
    private Stereo stereo;

    public StereoTurnOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.stereoTurnOFF();
    }

    @Override
    public void undo() {
        stereo.stereoTurnOn();
        stereo.setCD();
        stereo.setVolumeToNormal();
    }
}
