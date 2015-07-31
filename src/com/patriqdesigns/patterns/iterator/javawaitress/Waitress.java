package com.patriqdesigns.patterns.iterator.javawaitress;

import com.patriqdesigns.patterns.iterator.javawaitress.menu.Menu;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class Waitress {

    private String[] menuNames;
    private Menu[] menus;

    public Waitress(String[] menuNames, Menu[] menus) {
        this.menuNames = menuNames;
        this.menus = menus;
    }

    public void printMenu(){
        System.out.println("Menu");
        System.out.println("----");
        for (int i = 0; i < menuNames.length; i++) {
            System.out.println("\n"+menuNames[i]);
            printMenu(menus[i].iterator());
        }
    }

    private void printMenu(Iterator<MenuItem> menuItemIterator){
        while(menuItemIterator.hasNext()){
            MenuItem menuItem = menuItemIterator.next();
            System.out.println(menuItem.getName()+", ");
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
