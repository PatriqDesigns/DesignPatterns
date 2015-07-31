package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public interface Player {
    public void on();
    public void play(String title);
    public void pause();
    public void stop();
    public void off();
}
