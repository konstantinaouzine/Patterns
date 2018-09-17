package Patterns.Pattern_Command.RemoteControl_Example.Receivers_Of_Commands;

public class Stereo {
    private boolean stereoState = false;

    public void stereoTurnOn(){
        if (stereoState == false)
        {
            System.out.println("Turning ON the stereo system...");
            stereoState = !stereoState;
        }
        else
            System.out.println("Stereo already ON, do nothing");
    }

    public void stereoTurnOFF(){
        if (stereoState == true)
        {
            System.out.println("Turning OFF the stereo system...");
            stereoState = !stereoState;
        }
        else
            System.out.println("Stereo already OFF, do nothing");
    }

    public void setCD(){
        System.out.println("Setting CD");
    }

    public void setVolumeToNormal()
    {
        System.out.println("Setting volume to 10");
    }
}
