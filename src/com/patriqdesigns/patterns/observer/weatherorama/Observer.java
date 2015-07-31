package com.patriqdesigns.patterns.observer.weatherorama;

import java.util.Objects;

/**
 * Created by Andre on 15/07/15.
 */
public interface Observer {
    public void update(Observable observable);
}
