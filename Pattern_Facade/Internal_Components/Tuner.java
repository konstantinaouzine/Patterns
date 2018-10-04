package Patterns.Pattern_Facade.Internal_Components;

public class Tuner {
    public void on(){
        System.out.println("Tuner ON");
    }

    public void off(){
        System.out.println("Tuner OFF");
    }

    void setAM(){
        System.out.println("Tuner - set AM");
    }

    public void setFM(){
        System.out.println("Tuner - set FM");
    }

    public void setFrequency(double frequency){
        System.out.println("Tuner - frequency set to " + frequency);
    }
}
