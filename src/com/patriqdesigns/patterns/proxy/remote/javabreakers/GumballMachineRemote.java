package com.patriqdesigns.patterns.proxy.remote.javabreakers;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Andre on 24/07/15.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
