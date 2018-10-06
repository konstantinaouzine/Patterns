package Patterns.Pattern_Iterator;

public class DroneParrotMenu {
    MenuItem[] drones;
    int currentDronesAmount;
    int dronesMaxAmount = 10;

    public DroneParrotMenu(){
        drones = new MenuItem[dronesMaxAmount];
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
            drones[currentDronesAmount] = new MenuItem(name, price);
            currentDronesAmount++;
        }
    }

    public Iterator createIterator(){
        return new IteratorParrotMenu(drones);
    }
}
