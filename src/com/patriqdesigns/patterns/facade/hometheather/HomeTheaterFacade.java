package com.patriqdesigns.patterns.facade.hometheather;

import com.patriqdesigns.patterns.facade.hometheather.component.*;

/**
 * Created by Andre on 21/07/15.
 */
public class HomeTheaterFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String title) {
        System.out.println("Starting to watch \"" + title + "\".");
        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.setInput(dvdPlayer);
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(title);
    }

    public void endMovie() {
        System.out.println("Ending movie watching.");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd(String title) {
        System.out.println("Starting to listening to "+title+".");
    }

    public void endCd() {
        System.out.println("Ending cd listening.");
    }

    public void listenRadio(double frequency) {
        System.out.println("Starting listening to radio station which frequency is "+frequency+".");
    }

    public void endRadio() {
        System.out.println("Ending radio listening.");
    }

}
