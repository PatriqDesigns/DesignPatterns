package com.patriqdesigns.patterns.proxy.virtual.imagedisplayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andre on 24/07/15.
 */
public class ImageDisplayer {

    private static final String INITIAL_IMAGE_PATH = "i143JlB.png";

    private JFrame frame;
    private JTextField imagePathField;

    private ImageComponent imageComponent;

    public ImageDisplayer() throws Exception {
        frame = new JFrame("Image displayer");
        Icon currentIcon = new ImageProxy(INITIAL_IMAGE_PATH);
        imageComponent = new ImageComponent(currentIcon);

        JPanel hudPanel = new JPanel();
        imagePathField = new JTextField(40);
        JButton button = new JButton("Load");
        button.addActionListener(new LoadButtonListener());
        hudPanel.add(imagePathField);
        hudPanel.add(button);

        frame.getContentPane().add(imageComponent);
        frame.getContentPane().add(hudPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class ImageComponent extends JComponent {

        private Icon icon;

        public ImageComponent(Icon currentIcon) {
            this.icon = currentIcon;
        }

        public void setIcon(Icon icon) {
            this.icon = icon;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            int x = (frame.getWidth() - w) / 2;
            int y = (frame.getHeight() - h) / 2;
            icon.paintIcon(this, g, x, y);
        }
    }

    class LoadButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String path = imagePathField.getText();
            imageComponent.setIcon(new ImageProxy(path));
            frame.repaint();
        }
    }
}
