package com.patriqdesigns.patterns.compound.mvc.djcontrol;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.controller.BeatControllerInterface;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.controller.HeartController;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.HeartModel;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.HeartModelInterface;

import javax.swing.*;

/**
 * Created by Andre on 25/07/15.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        BeatModelInterface model = new BeatModel();
//        BeatControllerInterface controller = new BeatController(model);

        HeartModelInterface heartModel = new HeartModel();
        BeatControllerInterface heartController = new HeartController(heartModel);
    }
}
