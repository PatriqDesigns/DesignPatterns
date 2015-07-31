package com.patriqdesigns.patterns.proxy.protection.hotornot;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Andre on 24/07/15.
 */
public class OwnerInvocationHadler implements InvocationHandler {

    private PersonBean person;

    public OwnerInvocationHadler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get"))
            return method.invoke(person, args);
        if(method.getName().equals("setHotOrNotRating"))
            throw new IllegalAccessException();
        if(method.getName().startsWith("set"))
            return method.invoke(person, args);
        return null;
    }

}
