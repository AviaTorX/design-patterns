package chapter2.observerpattern.Java;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    // as of now this weatherData is not being used
    // but we are storing refrence just for future when
    // we need to unregister this display as observer
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("Updating currentDispaly attributes");
        this.temp = temp;
        this.humidity = humidity;
        // calling display inside update is not that good design choice
        // with this simple example we can do it here
        // but we can use something like Model-View-Controller pattern
        display();
    }

    public void display() {
        System.out.println("------------------------ Current Display --------------------------");
        System.out.println("CurrentConditionsDisplay: ");
        System.out.println("Temprature: "+temp);
        System.out.println("Humidity: "+humidity);
        System.out.println("-------------------------------------------------------------------");
    }
}
