package Patterns.Pattern_Iterator;

public class SaleAgent {
    private DroneDJIMenu droneDJIMenu;
    private DroneParrotMenu droneParrotMenu;

    public SaleAgent(DroneDJIMenu droneDJIMenu, DroneParrotMenu droneParrotMenu){
        this.droneDJIMenu = droneDJIMenu;
        this.droneParrotMenu = droneParrotMenu;
    }

    public void printDronesMenu(){
        Iterator djiIterator = droneDJIMenu.createIterator();
        Iterator parrotIterator = droneParrotMenu.createIterator();
        printDronesMenu(djiIterator);
        printDronesMenu(parrotIterator);
    }

    //Using method with a same name but this time access modifier is private because the method below used as utility internal method
    private void printDronesMenu(Iterator iterator){
        while(iterator.hasNext())
        {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", price - " + menuItem.getPrice());
        }
    }
}
