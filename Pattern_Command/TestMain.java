package Patterns.Pattern_Command;

import Patterns.Pattern_Command.Commands.*;
import Patterns.Pattern_Command.Receivers_Of_Commands.*;

public class TestMain {
    public static void main(String[] args) {
        //Creating receivers
        GarageDoor garageDoor = new GarageDoor();
        Light kitchenLight = new KitchenLight();
        Light livingRoomLight = new LivingRoomLight();
        CeilingFan ceilingFan = new CeilingFan();
        Stereo stereo = new Stereo();

        //Creating commands for receivers
        //GarageDoor commands
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        //Light commands
        //Kitchen
        LightOnCommand lightOnKitchenCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffKitchenCommand = new LightOffCommand(kitchenLight);
        //Living room
        LightOnCommand lightOnLivingRoomCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffLivingRoomCommand = new LightOffCommand(livingRoomLight);

        //Ceiling fan commands
        CeilingFanTurnOnCommand fanTurnOnCommand = new CeilingFanTurnOnCommand(ceilingFan);
        CeilingFanTurnOffCommand fanTurnOffCommand = new CeilingFanTurnOffCommand(ceilingFan);

        //Stereo commands
        StereoTurnOnCommand stereoOnCommand = new StereoTurnOnCommand(stereo);
        StereoTurnOffCommand stereoOffCommand = new StereoTurnOffCommand(stereo);

        //Creating MACRO COMMANDS
        MacroCommand turnOnAll = new MacroCommand(lightOnKitchenCommand, lightOnLivingRoomCommand, garageDoorOpenCommand, fanTurnOnCommand, stereoOnCommand);
        MacroCommand turnOffAll = new MacroCommand(lightOffKitchenCommand, lightOffLivingRoomCommand, garageDoorCloseCommand, fanTurnOffCommand, stereoOffCommand);

        HomeRemoteControl remote = new HomeRemoteControl();
        //Set living room light for button 0
        remote.setCommand(0, lightOnLivingRoomCommand, lightOffLivingRoomCommand);
        //Set kitchen light for button 1
        remote.setCommand(1, lightOnKitchenCommand, lightOffKitchenCommand);
        //Set Ceiling fan for button 2
        remote.setCommand(2, fanTurnOnCommand, fanTurnOffCommand);
        //Set Garage door for button 3
        remote.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        //Set stereo control for button 4
        remote.setCommand(4, stereoOnCommand, stereoOffCommand);
        //Setting macro-command for ALL on button 5
        remote.setCommand(5, turnOnAll, turnOffAll);
        remote.onButtonPushed(0);
        remote.onButtonPushed(0);
        remote.offButtonPushed(0);

        remote.offButtonPushed(3);
        remote.onButtonPushed(3);

        remote.onButtonPushed(4);
        remote.onButtonPushed(1);
        remote.onButtonPushed(2);
        System.out.println("-----------------");
        remote.offButtonPushed(5);
        System.out.println("-----------------");
        remote.onButtonPushed(5);
    }


}
