package com.patriqdesigns.patterns.proxy.remote.javabreakers;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.state.*;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Andre on 23/07/15.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;

    private String location;
    private int gumballsCount;
    private State currentState;

    public GumballMachine(String location, int gumballsCount) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.gumballsCount = gumballsCount;
        if(gumballsCount > 0){
            changeState(getNoQuarterState());
        }
    }

    public void insertQuarter(){
        getState().insertQuarter();
    }

    public void ejectQuarter(){
        getState().ejectQuarter();
    }

    public void turnCrank(){
        getState().turnCrank();
        getState().dispense();
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

    @Override
    public State getState(){
        return currentState;
    }

    @Override
    public int getCount() {
        return gumballsCount;
    }

    @Override
    public String getLocation() {
        return location;
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

    //Be sure to run rmiregistry in cmd!
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int gumballsCount;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            gumballsCount = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], gumballsCount){{
                insertQuarter();
            }};
            Naming.rebind(args[0], gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
