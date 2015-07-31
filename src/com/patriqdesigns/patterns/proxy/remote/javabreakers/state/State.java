package com.patriqdesigns.patterns.proxy.remote.javabreakers.state;

import java.io.Serializable;

/**
 * Created by Andre on 23/07/15.
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
