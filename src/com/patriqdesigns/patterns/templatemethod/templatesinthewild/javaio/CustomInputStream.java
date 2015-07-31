package com.patriqdesigns.patterns.templatemethod.templatesinthewild.javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * Created by Andre on 21/07/15.
 */
public class CustomInputStream extends InputStream {

    public static final int LETTERS_NUMBER = 1000;
    public static final int NEW_LINE_AFTER_LETTERS_AMOUNT = 100;

    private Random random;
    private int lettersRead;

    public CustomInputStream(){
        random = new Random();
    }

    @Override
    public int read() throws IOException {
        if(lettersRead++ >= LETTERS_NUMBER){
            return -1;
        }
        if(lettersRead%NEW_LINE_AFTER_LETTERS_AMOUNT == 0){
            return '\n';
        }
        return random.nextInt('z'-'a'+1)+'a';
    }

    public static void main(String[] args) {
        CustomInputStream inputStream = new CustomInputStream();
        try {
            int read;
            while((read = inputStream.read()) != -1){
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
