package com.patriqdesigns.patterns.proxy.remote.rmi101.server;

import com.patriqdesigns.patterns.proxy.remote.rmi101.MyRemote;

import java.rmi.Naming;

/**
 * Created by Andre on 24/07/15.
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        }catch (Exception e){}
    }
}
