package Patterns.Pattern_Iterator2;

import java.util.Iterator;

//Following class contains a specific 'collection'(Array) and a method that returns an iterator over this collection implementation
public class DroneParrotMenu implements Menu{
    Drone[] drones;
    int currentDronesAmount;
    int dronesMaxAmount = 10;

    public DroneParrotMenu(){
        drones = new Drone[dronesMaxAmount];
        currentDronesAmount = 0;
        addDrone("Anafi", 600);
        addDrone("Bepop 2 Power", 400);
        addDrone("Bepop 2", 300);
        addDrone("Mambo", 150);
    }

    public void addDrone(String name, double price){
        if (currentDronesAmount>=dronesMaxAmount)
            System.out.println("Drones amount exceeded the maximum, can't be added");
        else {
            drones[currentDronesAmount] = new Drone(name, price);
            currentDronesAmount++;
        }
    }

    //Method that returns an Iterator over the collection type that this Class includes
    public Iterator createIterator(){
        return new IteratorParrotMenu(drones);
    }
}
