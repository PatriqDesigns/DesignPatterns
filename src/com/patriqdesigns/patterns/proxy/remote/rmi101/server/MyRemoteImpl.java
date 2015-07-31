package com.patriqdesigns.patterns.proxy.remote.rmi101.server;

import com.patriqdesigns.patterns.proxy.remote.rmi101.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Andre on 24/07/15.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, \"Hello!\"";
    }
}
