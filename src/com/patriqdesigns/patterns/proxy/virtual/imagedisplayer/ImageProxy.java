package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer;

import com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state.LoadedState;
import com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state.LoadingState;
import com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state.State;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Andre on 24/07/15.
 */
public class ImageProxy implements Icon {

    private final State loadedState;
    private final State loadingState;

    private State state;
    private ImageIcon image;

    public ImageProxy(String path) {
        this.loadingState = new LoadingState(this, path);
        this.loadedState = new LoadedState(this);

        if (image == null) {
            state = loadingState;
        }
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getLoadingState() {
        return loadingState;
    }

    public State getLoadedState() {
        return loadedState;
    }
}
