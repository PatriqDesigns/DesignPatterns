package com.patriqdesigns.patterns.composite.javawaitress;

import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuComponent;
import com.patriqdesigns.patterns.composite.javawaitress.menu.VegetarianMenu;

/**
 * Created by Andre on 23/07/15.
 */
public class Waitress {

    private MenuComponent allMenus; //root of the tree
    private MenuComponent vegetarianMenu;

    public Waitress(MenuComponent mainMenu) {
        this.allMenus = mainMenu;
        this.vegetarianMenu = new VegetarianMenu(allMenus);
    }

    public void printMenu() {
//        Iterator<MenuComponent> menuComponentIterator = allMenus.iterator();
//        while(menuComponentIterator.hasNext()){
//            MenuComponent menu = menuComponentIterator.next();
//            if(menu instanceof Menu){
//                menu.print();
//            }
//        }
        allMenus.print();
    }

    public void printVegetarianMenu() {
        vegetarianMenu.print();
    }
}
