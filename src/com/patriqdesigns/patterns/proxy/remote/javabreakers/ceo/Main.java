package com.patriqdesigns.patterns.proxy.remote.javabreakers.ceo;

import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMachineRemote;
import com.patriqdesigns.patterns.proxy.remote.javabreakers.GumballMonitor;

import java.rmi.Naming;

/**
 * Created by Andre on 24/07/15.
 */
public class Main {
    public static void main(String[] args) {
        String[] locations = {
                "rmi://127.0.0.1/porto"
        };

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machine);
            }catch (Exception e){}
        }

        for (int i = 0; i < monitors.length; i++) {
            monitors[i].report();
        }
    }
}
