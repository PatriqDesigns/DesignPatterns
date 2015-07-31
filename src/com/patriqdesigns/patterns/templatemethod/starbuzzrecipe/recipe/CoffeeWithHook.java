package com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.recipe;

import com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.template.CaffeineBeverage;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andre on 21/07/15.
 */
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like milk and sugar in your coffee (y/n)?");
        return scanner.nextLine();
    }
}
