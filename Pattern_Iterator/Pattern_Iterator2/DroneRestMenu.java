package Patterns.Pattern_Iterator2;

import java.util.HashMap;
import java.util.Iterator;

public class DroneRestMenu implements Menu{
    private HashMap <String, Drone> drones;

    public DroneRestMenu(){
        drones = new HashMap<String, Drone>();
        addDrone("Mi4K", 2000);
        addDrone("Go Pro Karma", 1000);
        addDrone("Yuneec TyphoonH", 1100);
    }

    public void addDrone(String name, double price){
        this.drones.put(name, new Drone(name, price));
    }

    @Override
    //Getting Iterator over HashMap collection values
    public Iterator createIterator() {
        return drones.values().iterator();
    }
}