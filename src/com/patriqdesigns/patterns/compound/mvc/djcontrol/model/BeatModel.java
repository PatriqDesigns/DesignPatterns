package com.patriqdesigns.patterns.compound.mvc.djcontrol.model;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMEvent;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Andre on 25/07/15.
 */
public class BeatModel implements BeatModelInterface {

    private ArrayList<BeatObserver> beatObservers;
    private ArrayList<BPMObserver> bpmObservers;

    private int bpm;
    private Timer timer;

    public BeatModel() {
        bpmObservers = new ArrayList<BPMObserver>();
        beatObservers = new ArrayList<BeatObserver>();
    }

    @Override
    public void initialize() {
    }

    @Override
    public void on() {
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBpmObservers();
        cancelTimer();
        if (bpm > 0)
            createBeatTimer();
    }

    public void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    public void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.updateBeat();
        }
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        beatObservers.remove(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        bpmObservers.add(observer);
    }

    public void notifyBpmObservers() {
        BPMEvent bpmEvent = new BPMEvent(getBPM());
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM(bpmEvent);
        }
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        bpmObservers.remove(observer);
    }

    private void createBeatTimer() {
        timer = new Timer();
        long period = calculatePeriod();
        timer.scheduleAtFixedRate(new BeatTask(getBPM()), period, period);
    }

    private void cancelTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private long calculatePeriod() {
        return 60000L / (getBPM() + 1);
    }

    class BeatTask extends TimerTask {

        private long start = System.currentTimeMillis();
        private int beatCount = 0;
        private long bpm;

        public BeatTask(long bpm) {
            this.bpm = bpm;
        }

        @Override
        public void run() {
            if (System.currentTimeMillis() - start >= 60000) {
                System.out.println("Beats per minute: " + beatCount);
                beatCount = 0;
                start = System.currentTimeMillis();
                return;
            }
            if (beatCount >= bpm)
                return;
            beatCount++;
            beatEvent();
        }
    }
}
