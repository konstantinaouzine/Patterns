package Patterns.Pattern_Command.Commands;

import Patterns.Pattern_Command.Receivers_Of_Commands.CeilingFan;

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
