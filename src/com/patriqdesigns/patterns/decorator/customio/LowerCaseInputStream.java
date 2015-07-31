package com.patriqdesigns.patterns.decorator.customio;

import java.io.*;

/**
 * Created by Andre on 15/07/15.
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        if(read >= 'A' && read <= 'Z'){
            read += 'a'-'A';
        }
        return read;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if(result == -1) return result;
        for(int i = off; i < result+off; i++){
            byte c = b[i];
            if(c >= 'A' && c <= 'Z'){
                c += 'a' - 'A';
            }
            b[i] = c;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            LowerCaseInputStream in = new LowerCaseInputStream(new FileInputStream("out.txt"));
            byte[] read = new byte[1024];
            System.out.println(in.read(read));
            String line = new String(read);
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
