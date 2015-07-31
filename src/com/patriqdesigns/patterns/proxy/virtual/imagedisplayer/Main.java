package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer;

/**
 * Created by Andre on 24/07/15.
 */
public class Main {
    public static void main(String[] args) {
        try {
            new ImageDisplayer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
