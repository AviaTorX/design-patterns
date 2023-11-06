package chapter2.observerpattern.Java;

public class StatisticsDispaly implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDispaly(WeatherData weatherData) {
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
        System.out.println("------------------------ Statistics Display --------------------------");
        System.out.println("Statistics Dispaly: ");
        System.out.println("Average Temprature: "+temp);
        System.out.println("Average Humidity: "+humidity);
        System.out.println("Average Pressure: "+pressure);
        System.out.println("--------------------------------------------------------------------");
    }
}
