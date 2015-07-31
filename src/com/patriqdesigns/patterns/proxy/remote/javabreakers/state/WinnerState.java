package com.patriqdesigns.patterns.proxy.remote.javabreakers.state;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMachine;

/**
 * Created by Andre on 23/07/15.
 */
public class WinnerState implements State {

    private transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait we are already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("YOU ARE A WINNER! You get two gumballs instead of one!");
        gumballMachine.releaseGumball();
        gumballMachine.releaseGumball();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.changeState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs.");
            gumballMachine.changeState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Machine lost 2 gumballs.";
    }
}
