package com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.template;

/**
 * Created by Andre on 21/07/15.
 */
public abstract class CaffeineBeverage {

    //The template method right here!
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    //Primitive methods
    public abstract void brew();
    public abstract void addCondiments();

    //Concrete operations
    public final void boilWater() {
        System.out.println("Boiling water.");
    }

    public final void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    //Hooks
    public boolean customerWantsCondiments(){
        return true;
    }


}
