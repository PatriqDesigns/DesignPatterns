package com.patriqdesigns.patterns.facade.hometheather;

import com.patriqdesigns.patterns.facade.hometheather.component.*;

/**
 * Created by Andre on 21/07/15.
 */
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );
        homeTheater.watchMovie("Home");
        System.out.println();
        homeTheater.endMovie();
    }
}
