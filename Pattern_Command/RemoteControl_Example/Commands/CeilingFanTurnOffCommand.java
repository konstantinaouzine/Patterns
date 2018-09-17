package Patterns.Pattern_Command.RemoteControl_Example.Commands;

import Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands.CeilingFan;

public class CeilingFanTurnOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanTurnOffCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.fanTurnOFF();
    }

    @Override
    public void undo() {
        ceilingFan.fanTurnOn();
    }
}
