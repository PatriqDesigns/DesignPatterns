package com.patriqdesigns.patterns.adapter.duckandturkey;

import com.patriqdesigns.patterns.adapter.duckandturkey.adapter.DuckAdapter;
import com.patriqdesigns.patterns.adapter.duckandturkey.adapter.TurkeyAdapter;
import com.patriqdesigns.patterns.adapter.duckandturkey.duck.Duck;
import com.patriqdesigns.patterns.adapter.duckandturkey.duck.MallardDuck;
import com.patriqdesigns.patterns.adapter.duckandturkey.turkey.Turkey;
import com.patriqdesigns.patterns.adapter.duckandturkey.turkey.WildTurkey;

/**
 * Created by Andre on 21/07/15.
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(adapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
