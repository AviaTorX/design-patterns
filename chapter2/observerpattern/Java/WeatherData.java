package chapter2.observerpattern.Java;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObservers(Observer o) {
        observers.add(o);
    }

    public void unRegisterObservers(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer obs: observers) {
            obs.update(temp, humidity, pressure);
        }
    }

    public void setMeasureMents(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measureMentsChanged();
    }

    public void measureMentsChanged() {
        notifyObservers();
    }
}
