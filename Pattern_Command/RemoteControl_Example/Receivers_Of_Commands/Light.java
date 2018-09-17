package Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands;

public class Light {
    private boolean lightOnState = false;

    public void lightTurnOn(){
        if (lightOnState == false)
        {
            System.out.println("Turning ON the light...");
            lightOnState = !lightOnState;
        }
        else
            System.out.println("Light already ON, do nothing");
    }

    public void lightTurnOFF(){
        if (lightOnState == true)
        {
            System.out.println("Turning OFF the light...");
            lightOnState = !lightOnState;
        }
        else
            System.out.println("Light already OFF, do nothing");
    }
}
