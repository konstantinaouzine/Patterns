package Patterns.Pattern_Command.Receivers_Of_Commands;

public class CeilingFan {
    private boolean fanState = false;

    public void fanTurnOn(){
        if (fanState  == false)
        {
            System.out.println("Turning ON the fan...");
            fanState  = !fanState ;
        }
        else
            System.out.println("Fan already ON, do nothing");
    }

    public void fanTurnOFF(){
        if (fanState  == true)
        {
            System.out.println("Turning OFF the fan...");
            fanState  = !fanState ;
        }
        else
            System.out.println("Fan already OFF, do nothing");
    }
}
