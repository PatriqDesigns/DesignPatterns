package com.patriqdesigns.patterns.state.javabreakers.state;

/**
 * Created by Andre on 23/07/15.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
