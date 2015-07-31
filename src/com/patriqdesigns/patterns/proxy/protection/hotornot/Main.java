package com.patriqdesigns.patterns.proxy.protection.hotornot;

import java.lang.reflect.Proxy;

/**
 * Created by Andre on 24/07/15.
 */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();
//        PersonBean joe = database.getPerson("Joe Javabean");
//        System.out.println("Is "+joe.getName()+" a proxy class? "+Proxy.isProxyClass(joe.getClass())+"\n");

        System.out.println("Result from owner proxy.");
        PersonBean ownerProxy = database.getOwnerProxy("Joe Javabean");
        System.out.println("Name is: " + ownerProxy.getName());
        ownerProxy.setInterests("Bowling, Run");
        System.out.println("Interests changed to: "+ownerProxy.getInterests()+" from owner proxy.");
        try {
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy.");
        }
        System.out.println("Rating is: "+ownerProxy.getHotOrNotRating());
        System.out.println("Is owner proxy a proxy class? "+ Proxy.isProxyClass(ownerProxy.getClass()));

        System.out.println("\nResult from non owner proxy.");
        PersonBean nonOwnerProxy = database.getNonOwnerProxy("Joe Javabean");
        System.out.println("Name is: "+nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Do nothing, Scratch ass all day");
        }catch (Exception e){
            System.out.println("Can't set interests from non owner proxy.");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rated from non owner proxy.");
        System.out.println("Rating is: "+nonOwnerProxy.getHotOrNotRating());
        System.out.println("Is on owner proxy a proxy class? "+ Proxy.isProxyClass(nonOwnerProxy.getClass()));
    }
}
