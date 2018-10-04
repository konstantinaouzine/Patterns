package Patterns.Pattern_Facade.Internal_Components;

public class Amplifier {
    DvdPlayer dvdPlayer;
    Tuner tuner;

    void on(){
        System.out.println("Amplifier ON");
    }

    public void off(){
        System.out.println("Amplifier OFF");
    }

    public void setVolume(int volumeLevel){
        System.out.println("Volume set to " + volumeLevel);
    }

    public void setSurroundMode(){
        System.out.println("Surround mode activated");
    }

    public void setStereoMode(){
        System.out.println("Stereo mode activated");
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    public void setTuner(Tuner tuner){
        this.tuner = tuner;
    }
}
