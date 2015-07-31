package com.patriqdesigns.patterns.adapter.realwordadapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * Created by Andre on 21/07/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Using IteratorAdapter...");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        IteratorAdapter<Integer> iteratorAdapter = new IteratorAdapter<Integer>(arrayList.iterator());
        while (iteratorAdapter.hasMoreElements()){
            System.out.println(iteratorAdapter.nextElement());
        }

        System.out.println("\nUsing EnumerationAdapter...");
        Vector<Integer> vector = new Vector<Integer>();
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        EnumerationAdapter<Integer> enumerationAdapter = new EnumerationAdapter<Integer>(vector.elements());
        while(enumerationAdapter.hasNext()){
            System.out.println(enumerationAdapter.next());
        }
    }
}
