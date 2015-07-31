package com.patriqdesigns.patterns.compound.mvc.djcontrol.model;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMEvent;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Andre on 26/07/15.
 */
public class HeartModel implements HeartModelInterface, Runnable {

    private ArrayList<BPMObserver> bpmObservers;
    private ArrayList<BeatObserver> beatObservers;

    private int time = 1000;
    private Random random;

    public HeartModel() {
        beatObservers = new ArrayList<BeatObserver>();
        bpmObservers = new ArrayList<BPMObserver>();
        random = new Random(System.currentTimeMillis());
        new Thread(this).start();
    }

    @Override
    public void run() {
        int lastRate = -1;
        for (; ; ) {
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0) {
                change = 0 - change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50) {
                time += change;
                notifyBeatObservers();
                if (rate != lastRate) {
                    lastRate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    public int getHeartRate() {
        return 60000 / time;
    }

    @Override
    public void registerBeatObserver(BeatObserver beatObserver) {
        beatObservers.add(beatObserver);
    }

    public void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.updateBeat();
        }
    }

    @Override
    public void registerBPMObserver(BPMObserver bpmObserver) {
        bpmObservers.add(bpmObserver);
    }

    public void notifyBPMObservers() {
        BPMEvent bpmEvent = new BPMEvent(getHeartRate());
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM(bpmEvent);
        }
    }
}
