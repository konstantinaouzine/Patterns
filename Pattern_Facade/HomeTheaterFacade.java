package Patterns.Pattern_Facade;

import Patterns.Pattern_Facade.Internal_Components.*;

public class HomeTheaterFacade implements MovieControl, TunerControl{
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private PopcornPopper popcornPopper;
    private Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, Screen screen,
                             TheaterLights theaterLights, PopcornPopper popcornPopper, Tuner tuner) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
        this.tuner = tuner;
    }


    @Override
    public void playMovie(String movie) {
        System.out.println("Facade - get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.setSurroundMode();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    @Override
    public void stopMovie() {
        System.out.println("Facade - Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    @Override
    public void pauseMovie() {
        dvdPlayer.pause();
    }

    @Override
    public void listenToRadio() {
        tuner.on();
        tuner.setFM();
        tuner.setFrequency(89.1);
    }

    @Override
    public void turnOffRadio() {
        tuner.off();
    }
}
