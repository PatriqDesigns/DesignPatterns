package com.patriqdesigns.patterns.proxy.remote.javabreakers.state;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMachine;

/**
 * Created by Andre on 23/07/15.
 */
public class SoldOutState implements State {

    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't insert, there is no quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override
    public String toString() {
        return "Machine is sold out.";
    }
}
