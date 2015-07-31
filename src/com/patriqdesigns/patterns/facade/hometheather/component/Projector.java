package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class Projector {

    private Player player;

    public void on(){
        System.out.println("Turning projector on.");
    }

    public void off(){
        System.out.println("Turning projector off.");
    }

    public void setInput(Player player){
        this.player = player;
        System.out.println("Setting projector input to "+player.getClass().getSimpleName()+" mode.");
    }

    public void wideScreenMode(){
        System.out.println("Setting projector to wide-screen mode (16x9).");
    }

}
