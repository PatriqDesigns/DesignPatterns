package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state;

import com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.ImageProxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Andre on 24/07/15.
 */
public class LoadedState implements State {

    private ImageProxy proxy;

    public LoadedState(ImageProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public int getIconWidth() {
        return proxy.getImage().getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return proxy.getImage().getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        proxy.getImage().paintIcon(c, g, x, y);
    }
}
