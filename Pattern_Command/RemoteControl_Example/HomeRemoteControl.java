package Patterns.Pattern_Command.RemoteControl_Example;

import Patterns.Pattern_Command.RemoteControl_Example.Commands.Command;
import Patterns.Pattern_Command.RemoteControl_Example.Commands.NoCommand;

public class HomeRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;


    HomeRemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i =0 ; i < 7; i++)
        {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
    }
}
