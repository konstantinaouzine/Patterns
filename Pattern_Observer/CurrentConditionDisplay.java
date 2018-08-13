package Pattern_Observer;

import java.util.Date;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private int temperature;
    private int humidity;
    private int pressure;

    public CurrentConditionDisplay(WeatherData weatherData1)
    {
        this.weatherData = weatherData1;
    }

    @Override
        public void display() {
        System.out.println(new Date().toString());
            System.out.println("Temperature: " + temperature + "C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Pressure: " + pressure + "mm");
            System.out.println("---------------------");
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
