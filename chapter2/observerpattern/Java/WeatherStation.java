package chapter2.observerpattern.Java;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDispaly forecastDisplay = new ForecastDispaly(weatherData);
        StatisticsDispaly statisticsDispaly = new StatisticsDispaly(weatherData);

        weatherData.setMeasureMents(80, 65, 30.4f);
    }
}
