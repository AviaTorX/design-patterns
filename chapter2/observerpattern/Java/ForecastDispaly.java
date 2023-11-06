package chapter2.observerpattern.Java;

public class ForecastDispaly implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDispaly(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("------------------------ Forecast Display --------------------------");
        System.out.println("Forecast Dispaly: ");
        System.out.println("Temprature: "+temp);
        System.out.println("Humidity: "+humidity);
        System.out.println("Pressure: "+pressure);
        System.out.println("--------------------------------------------------------------------");
    }

}
