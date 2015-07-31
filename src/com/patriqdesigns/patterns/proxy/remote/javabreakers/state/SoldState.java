package com.patriqdesigns.patterns.proxy.remote.javabreakers.state;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMachine;

/**
 * Created by Andre on 23/07/15.
 */
public class SoldState implements State {

    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
        gumballMachine.releaseGumball();
        if(gumballMachine.getCount() == 0){
            System.out.println("Oops, out of gumballs.");
            gumballMachine.changeState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.changeState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public String toString() {
        return "Machine just sold a gumball.";
    }
}
