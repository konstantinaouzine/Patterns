package Patterns.Pattern_Iterator2;

import java.util.Iterator;

public class SaleAgent {
    private Menu droneDJIMenu;
    private Menu droneParrotMenu;
    private Menu droneRestMenu;

    public SaleAgent(Menu droneDJIMenu, Menu droneParrotMenu, Menu droneRestMenu){
        this.droneDJIMenu = droneDJIMenu;
        this.droneParrotMenu = droneParrotMenu;
        this.droneRestMenu = droneRestMenu;
    }

    public void printDronesMenu(){
        Iterator djiIterator = droneDJIMenu.createIterator();
        Iterator parrotIterator = droneParrotMenu.createIterator();
        Iterator restIterator = droneRestMenu.createIterator();
        System.out.println("---DJI Drones---");
        printDronesMenu(djiIterator);
        System.out.println("--------------------");
        System.out.println("---Parrot Drones---");
        printDronesMenu(parrotIterator);
        System.out.println("--------------------");
        System.out.println("---Rest of Drones---");
        printDronesMenu(restIterator);
    }

    //Using method with a same name but this time access modifier is private because the method below used as utility internal method
    private void printDronesMenu(Iterator iterator){
        while(iterator.hasNext())
        {
            Drone menuItem = (Drone)iterator.next();
            System.out.println(menuItem.getName() + ", price - " + menuItem.getPrice());
        }
    }
}
