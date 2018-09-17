package Patterns.Pattern_Command.Commands;

import Patterns.Pattern_Command.Receivers_Of_Commands.CeilingFan;

public class CeilingFanTurnOnCommand implements Command{
    private CeilingFan ceilingFan;

    public CeilingFanTurnOnCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.fanTurnOn();
    }

    @Override
    public void undo() {
        ceilingFan.fanTurnOFF();
    }
}
