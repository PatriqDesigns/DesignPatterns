package com.patriqdesigns.patterns.singleton.chocaoholic;

/**
 * Created by Andre on 16/07/15.
 */
public class ChocolateBoiler {

    private static final int CAPACITY = 500;

    private boolean empty, boiled;
    private int amountFilled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    //If using threads i don't only have to use synchronized here, every single method
    //needs to use it otherwise we may encounter thread problems and filling more than we can fill!
    public static synchronized ChocolateBoiler getInstance(){
        if(instance == null){
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    //Remove the synchronized and you will see shit ton of warnings!
    public synchronized void fill(){
        if(isEmpty()){
            warn();
            empty = false;
            amountFilled += 500;
            warn();
        }
    }

    //Remove the synchronized and you will see shit ton of warnings!
    public synchronized void boil(){
        if(!isEmpty() && !isBoiled()){
            warn();
            boiled = true;
            warn();
        }
    }

    //Remove the synchronized and you will see shit ton of warnings!
    public synchronized void empty(){
        if(!isEmpty() && isBoiled()){
            warn();
            empty = true;
            boiled = false;
            amountFilled -= 500;
            warn();
        }
    }

    public void warn(){
        if(getAmountFilled() > CAPACITY){
            System.out.println("WARNING OVERFLOW!!!!");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public int getAmountFilled() {
        return amountFilled;
    }
}
