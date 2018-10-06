package Patterns.Pattern_Iterator;

public class TestMain {
    public static void main(String[] args) {
        DroneDJIMenu droneDJIMenu = new DroneDJIMenu();
        DroneParrotMenu droneParrotMenu = new DroneParrotMenu();
        SaleAgent saleAgent = new SaleAgent(droneDJIMenu, droneParrotMenu);
        saleAgent.printDronesMenu();
    }
}
