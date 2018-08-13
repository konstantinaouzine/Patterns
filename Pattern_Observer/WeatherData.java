package Pattern_Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observersList;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData(int temp, int humidity, int pressure)
    {
        observersList = new ArrayList<>();
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void register(Observer o) {
        observersList.add(o);
        notifyOberver(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList)
        {
            observer.update(temperature, humidity, pressure);
        }
    }

    //Update observer data at registration moment
    private void notifyOberver(Observer o)
    {
        o.update(temperature, humidity, pressure);
    }

    private void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(int temp, int humidity, int pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
