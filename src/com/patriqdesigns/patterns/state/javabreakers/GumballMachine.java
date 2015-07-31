package com.patriqdesigns.patterns.state.javabreakers;

import com.patriqdesigns.patterns.state.javabreakers.state.*;

/**
 * Created by Andre on 23/07/15.
 */
public class GumballMachine {

    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;

    private int gumballsCount;
    private State currentState;

    public GumballMachine(int gumballsCount) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.gumballsCount = gumballsCount;
        if(gumballsCount > 0){
            changeState(getNoQuarterState());
        }
    }

    public void insertQuarter(){
        getCurrentState().insertQuarter();
    }

    public void ejectQuarter(){
        getCurrentState().ejectQuarter();
    }

    public void turnCrank(){
        getCurrentState().turnCrank();
        getCurrentState().dispense();
    }

    public void releaseGumball(){
        System.out.println("A gumball comes rolling out the slot...");
        gumballsCount--;
    }

    public void refill(int amount){
        System.out.println("Refilling gumball machine.");
        gumballsCount = amount;
        changeState(getNoQuarterState());
    }

    public void changeState(State state){
        this.currentState = state;
    }

    public State getCurrentState(){
        return currentState;
    }

    public int getGumballsCount() {
        return gumballsCount;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\n" +
                "Inventory: "+ gumballsCount +" gumballs\n"+currentState+"\n";
    }
}
