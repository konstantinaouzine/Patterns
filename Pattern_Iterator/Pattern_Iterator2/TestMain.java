package Patterns.Pattern_Iterator2;

public class TestMain {
    public static void main(String[] args) {
        DroneDJIMenu droneDJIMenu = new DroneDJIMenu();
        DroneParrotMenu droneParrotMenu = new DroneParrotMenu();
        DroneRestMenu droneRestMenu = new DroneRestMenu();
        SaleAgent saleAgent = new SaleAgent(droneDJIMenu, droneParrotMenu, droneRestMenu);
        saleAgent.printDronesMenu();
    }
}
