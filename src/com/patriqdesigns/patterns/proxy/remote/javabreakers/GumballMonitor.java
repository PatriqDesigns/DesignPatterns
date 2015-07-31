package com.patriqdesigns.patterns.proxy.remote.javabreakers;

import java.rmi.RemoteException;

/**
 * Created by Andre on 24/07/15.
 */
public class GumballMonitor {

    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: "+gumballMachine.getLocation());
            System.out.println("Current inventory: "+gumballMachine.getCount());
            System.out.println("Current state: "+gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
