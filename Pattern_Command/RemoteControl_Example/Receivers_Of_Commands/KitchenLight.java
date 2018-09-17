package Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands;

public class KitchenLight extends Light {
    @Override
    public void lightTurnOn() {
        System.out.print("Kitchen: ");
        super.lightTurnOn();
    }

    @Override
    public void lightTurnOFF() {
        System.out.print("Kitchen: ");
        super.lightTurnOFF();
    }
}
