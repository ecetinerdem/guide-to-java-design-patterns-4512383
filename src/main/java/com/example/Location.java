package com.example;

import java.beans.PropertyChangeSupport;

public class Location {
    private String weatherEvent;
    private PropertyChangeSupport pChangeSupport = new PropertyChangeSupport(this);

    public void setWeatherEvent(String weatherEvent) {
        pChangeSupport.firePropertyChange("weatherEvent", this.weatherEvent, weatherEvent);
        this.weatherEvent = weatherEvent;
    }

    public void addPropertyChangeListener(WeatherUpdates weatherUpdates) {
        pChangeSupport.addPropertyChangeListener(weatherUpdates);
    }

}
