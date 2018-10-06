package Patterns.Pattern_Iterator;

import java.util.ArrayList;

public class DroneDJIMenu {
    ArrayList<MenuItem> drones;

    public DroneDJIMenu(){
        drones = new ArrayList<>();
        addDrone("MavicPro", 1500);
        addDrone("MavicZoom", 1300);
        addDrone("Air", 1000);
        addDrone("Phantom", 1400);
    }

    public void addDrone(String name, double price){
        this.drones.add(new MenuItem(name, price));
    }

    public Iterator createIterator(){
        return new IteratorDJIMenu(drones);
    }

}
