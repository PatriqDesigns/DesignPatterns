package com.patriqdesigns.patterns.proxy.remote.rmi101;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Andre on 24/07/15.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
