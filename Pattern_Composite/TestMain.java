package Patterns.Pattern_Composite;

public class TestMain {
    public static void main(String[] args) {
        DroneComponent djiDrones = new DronesMenu("DJI Drones");
        djiDrones.add(new Drone("MavicPro", 1500));
        djiDrones.add(new Drone("MavicZoom", 1300));
        djiDrones.add(new Drone("Air", 1000));
        djiDrones.add(new Drone("Phantom", 1400));

        DroneComponent parrotDrones = new DronesMenu("Parrot Drones");
        parrotDrones.add(new Drone("Anafi", 600));
        parrotDrones.add(new Drone("Bepop 2 Power", 400));
        parrotDrones.add(new Drone("Bepop 2", 300));
        parrotDrones.add(new Drone("Mambo", 150));

        DroneComponent restDrones = new DronesMenu("Rest of Drones");
        Drone xiaomi4K = new Drone("Mi4K", 2000);
        Drone goPRO_Karma = new Drone("Go Pro Karma", 1000);
        Drone yeneec = new Drone("Yuneec TyphoonH", 1100);
        restDrones.add(xiaomi4K);
        restDrones.add(goPRO_Karma);
        restDrones.add(yeneec);

        DroneComponent phantomDrones = new DronesMenu("DJI Phantom serie");
        phantomDrones.add(new Drone("Phantom 1", 500));
        phantomDrones.add(new Drone("Phantom 2", 800));
        phantomDrones.add(new Drone("Phantom 3", 1200));
        phantomDrones.add(new Drone("Phantom 4", 1700));

        //Placing phantomDrones into DJI drones. Actually placing menu inside another menu
        djiDrones.add(phantomDrones);

        DroneComponent allDrones = new DronesMenu("All Drones");
        //Pay attention that djiDrones also includes phantomDrones inside and as result also will be printed
        allDrones.add(djiDrones);
        allDrones.add(parrotDrones);
        allDrones.add(restDrones);

        SaleAgent saleAgent1 = new SaleAgent(allDrones);
        saleAgent1.printAll();
    }
}
