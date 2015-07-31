package com.patriqdesigns.patterns.proxy.remote.javabreakers.state;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMachine;

import java.util.Random;

/**
 * Created by Andre on 23/07/15.
 */
public class HasQuarterState implements State {

    private transient GumballMachine gumballMachine;
    private transient Random random;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        gumballMachine.changeState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = random.nextInt(10);
        if(winner == 0 && gumballMachine.getCount() > 1){
            gumballMachine.changeState(gumballMachine.getWinnerState());
            return;
        }
        gumballMachine.changeState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override
    public String toString() {
        return "Machine has a quarter.";
    }
}
