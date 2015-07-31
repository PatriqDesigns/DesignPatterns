package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer.state;

import java.awt.*;

/**
 * Created by Andre on 24/07/15.
 */
public interface State {
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
