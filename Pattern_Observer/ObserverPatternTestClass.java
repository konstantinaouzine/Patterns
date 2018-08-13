package Pattern_Observer;

import java.util.concurrent.TimeUnit;

public class ObserverPatternTestClass {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData(40, 70, 950);
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        //Make conditionDisplay to become the observer of WeatherData
        //display() method call added to register() method to instantly print the new values
        weatherData.register(conditionDisplay);
        TimeUnit.SECONDS.sleep(5);
        //display() method added to setMeasurements() method to instantly print the new values
        weatherData.setMeasurements(42, 65, 1000);
    }
}
