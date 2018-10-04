package Patterns.Pattern_Facade.Internal_Components;

public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("DVD Player ON");
    }

    public void off(){
        System.out.println("DVD Player OFF");
    }

    public void play(String movie){
        System.out.println("DVD Player - " + movie + " play started");
    }

    public void pause(){
        System.out.println("DVD Player - movie play paused");
    }

    public void stop(){
        System.out.println("DVD Player - movie stopped");
    }

    public void eject(){
        System.out.println("DVD Player - Disc ejected");
    }

    void setSurroundAudio(){
        amplifier.setSurroundMode();
    }

    void setStereoAudio(){
        amplifier.setStereoMode();
    }
}
