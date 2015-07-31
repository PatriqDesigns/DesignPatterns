package com.patriqdesigns.patterns.compound.mvc.djcontrol.view;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMEvent;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.controller.BeatControllerInterface;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.BeatModelInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Andre on 25/07/15.
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {

    private BeatControllerInterface controller;

    private JFrame viewFrame;
    private JPanel viewPanel;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    private JFrame controlFrame;
    private JPanel controlPanel;
    private JTextField bpmTextField;
    private JButton setBpmButton;
    private JButton increaseBpmButton;
    private JButton decreaseBpmButton;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;
    private JMenuItem viewMenuItem;
    private JMenuItem quitMenuItem;

    public DJView(BeatControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    public void createView() {
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel insidePanel = new JPanel(new GridLayout(2, 1));
        beatBar = new BeatBar();
        bpmOutputLabel = new JLabel("Offline", SwingConstants.CENTER);
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        insidePanel.add(beatBar);
        insidePanel.add(bpmOutputLabel);

        viewPanel = new JPanel(new GridLayout(1, 1));
        viewPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        viewPanel.add(insidePanel);

        viewFrame.getContentPane().add(viewPanel);
        viewFrame.pack();
        viewFrame.setLocationRelativeTo(null);
        viewFrame.setVisible(true);
    }

    public void createControls() {
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.start();
            }
        });
        viewMenuItem = new JMenuItem("View");
        viewMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewFrame.setVisible(true);
            }
        });
        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.stop();
            }
        });
        quitMenuItem = new JMenuItem("Quit");
        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(startMenuItem);
        menu.add(stopMenuItem);
        menu.add(viewMenuItem);
        menu.add(quitMenuItem);
        menuBar.add(menu);

        controlFrame.setJMenuBar(menuBar);

        JPanel bpmPanel = new JPanel(new GridLayout(1, 2));
        bpmPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        JLabel setBpmLabel = new JLabel("Set BPM:");
        bpmTextField = new JTextField(10);
        bpmPanel.add(setBpmLabel);
        bpmPanel.add(bpmTextField);

        setBpmButton = new JButton("Set");
        controlFrame.getRootPane().setDefaultButton(setBpmButton);

        JPanel increaseDecreasePanel = new JPanel(new GridLayout(1, 2));
        increaseDecreasePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        setBpmButton.addActionListener(this);
        increaseBpmButton = new JButton(">>");
        increaseBpmButton.addActionListener(this);
        decreaseBpmButton = new JButton("<<");
        decreaseBpmButton.addActionListener(this);
        increaseDecreasePanel.add(decreaseBpmButton);
        increaseDecreasePanel.add(increaseBpmButton);

        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        insideControlPanel.add(bpmPanel);
        insideControlPanel.add(setBpmButton);
        insideControlPanel.add(increaseDecreasePanel);

        controlPanel = new JPanel(new GridLayout(1, 1));
        controlPanel.add(insideControlPanel);

        controlFrame.getContentPane().add(controlPanel);

        controlFrame.pack();
        controlFrame.setLocationRelativeTo(null);
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(setBpmButton)) {
            controller.setBPM(Integer.parseInt(bpmTextField.getText()));
        } else if (e.getSource().equals(increaseBpmButton)) {
            controller.increaseBPM();
        } else if (e.getSource().equals(decreaseBpmButton)) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM(BPMEvent event) {
        int bpm = event.getBpm();
        if (bpm == 0)
            bpmOutputLabel.setText("Offline");
        else
            bpmOutputLabel.setText("Current BPM: " + bpm);
    }

    @Override
    public void updateBeat() {
        beatBar.beat();
    }

    public void setController(BeatControllerInterface controller) {
        this.controller = controller;
    }

    class BeatBar extends JProgressBar {

        private static final int MAX = 500;

        private Random random;
        private int beatCount;

        public BeatBar() {
            super(HORIZONTAL, 0, MAX);
            random = new Random();
        }

        public void beat() {
            beatBar.setValue((int) (MAX * 0.2 + (random.nextInt((int) (MAX * 0.8)) * (beatCount % 2))));
            beatCount++;
        }

    }

}


