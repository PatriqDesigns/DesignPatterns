package com.patriqdesigns.patterns.proxy.remote.rmi101.client;

import com.patriqdesigns.patterns.proxy.remote.rmi101.MyRemote;

import java.rmi.Naming;

/**
 * Created by Andre on 24/07/15.
 */
public class Main {
    public static void main(String[] args) {
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
