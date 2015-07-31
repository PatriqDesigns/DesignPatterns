package com.patriqdesigns.patterns.proxy.protection.hotornot;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

/**
 * Created by Andre on 25/07/15.
 */
public class Database { //Nope not really xD

    private Hashtable<String, PersonBean> persons;

    public Database() {
        this.persons = new Hashtable<String, PersonBean>();

        addPerson(new Person("Joe Javabean", "Male", "None"));
    }

    private PersonBean getPerson(String name) {
        return persons.get(name);
    }

    private PersonBean addPerson(PersonBean person) {
        return persons.put(person.getName(), person);
    }

    public PersonBean getOwnerProxy(String name){
        PersonBean person = getPerson(name);
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHadler(person)
        );
    }

    public PersonBean getNonOwnerProxy(String name){
        PersonBean person = getPerson(name);
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
