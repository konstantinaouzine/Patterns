package Patterns.Pattern_Command.Receivers_Of_Commands;

public class LivingRoomLight extends Light {
    @Override
    public void lightTurnOn() {
        System.out.print("Living Room: ");
        super.lightTurnOn();
    }

    @Override
    public void lightTurnOFF() {
        System.out.print("Living Room: ");
        super.lightTurnOFF();
    }
}
