package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state;

import com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.ImageProxy;
import sun.font.FontDesignMetrics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Andre on 24/07/15.
 */
public class LoadingState implements State {

    private static final String LOADING_MESSAGE = "Loading image, please wait...";

    private String imagePath;
    private ImageProxy imageProxy;
    private boolean retrieving;

    private Font font;
    private FontMetrics metrics;

    public LoadingState(ImageProxy imageProxy, String path) {
        this.imagePath = path;
        this.imageProxy = imageProxy;
        font = new Font(Font.DIALOG, 0, 13);
        metrics = FontDesignMetrics.getMetrics(font);
    }

    @Override
    public int getIconWidth() {
        return metrics.stringWidth(LOADING_MESSAGE);
    }

    @Override
    public int getIconHeight() {
        return metrics.getHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.setFont(font);
        g.drawString(LOADING_MESSAGE, x, y);
        loadImage(c);
    }

    private void loadImage(final Component c) {
        if (!retrieving) {
            retrieving = true;
            Thread retrievalThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    ImageIcon imageIcon = new ImageIcon(imagePath, "CD cover");
                    imageProxy.setImage(imageIcon);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    imageProxy.changeState(imageProxy.getLoadedState());
                    c.repaint();
                }
            });
            retrievalThread.start();
        }
    }
}
