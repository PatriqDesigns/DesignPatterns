package com.patriqdesigns.patterns.proxy.protection.hotornot;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Andre on 24/07/15.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get"))
            return method.invoke(person, args);
        if(method.getName().equals("setHotOrNotRating"))
            return method.invoke(person, args);
        if(method.getName().startsWith("set"))
            throw new IllegalAccessException();
        return null;
    }
}
