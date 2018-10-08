package Patterns.Pattern_Iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class DroneDJIMenu implements Menu{
    ArrayList<Drone> drones;

    public DroneDJIMenu(){
        drones = new ArrayList<Drone>();
        addDrone("MavicPro", 1500);
        addDrone("MavicZoom", 1300);
        addDrone("Air", 1000);
        addDrone("Phantom", 1400);
    }

    public void addDrone(String name, double price){
        this.drones.add(new Drone(name, price));
    }

    public Iterator createIterator(){
        return drones.iterator();
    }

}
