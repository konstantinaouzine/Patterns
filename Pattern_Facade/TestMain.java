package Patterns.Pattern_Facade;

import Patterns.Pattern_Facade.Internal_Components.*;

public class TestMain {
    public static void main(String[] args) {
        //Creating components
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
        Tuner tuner = new Tuner();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setTuner(tuner);
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();

        //Creating facade object that will control all internal components
        HomeTheaterFacade facade1 = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, theaterLights, popcornPopper, tuner);

        //Creating user which will control the facade(remote)
        User user1 = new User("Kosta", facade1);
        user1.watchMovie("Terminator 2");
        user1.takeBreakFromMovie();
        user1.startLearning();

    }
}
