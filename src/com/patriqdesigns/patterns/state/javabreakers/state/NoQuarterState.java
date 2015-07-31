package com.patriqdesigns.patterns.state.javabreakers.state;

import com.patriqdesigns.patterns.state.javabreakers.GumballMachine;

/**
 * Created by Andre on 23/07/15.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.changeState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }

    @Override
    public String toString() {
        return "Machine is waiting for a quarter.";
    }
}
