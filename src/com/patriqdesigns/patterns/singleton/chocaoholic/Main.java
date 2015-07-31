package com.patriqdesigns.patterns.singleton.chocaoholic;

/**
 * Created by Andre on 16/07/15.
 */
public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
                    boiler.fill();
                    boiler.boil();
                    boiler.empty();
                }
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
