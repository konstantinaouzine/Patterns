package Patterns.Pattern_Composite;

public class TestMain {
    public static void main(String[] args) {
        DroneComponent djiDrones = new DronesMenu("DJI Drones");
        djiDrones.add(new Drone("Mavic_Pro", 1500, true));
        djiDrones.add(new Drone("Mavic_Zoom", 1300, true));
        djiDrones.add(new Drone("Air", 1000, false));

        DroneComponent parrotDrones = new DronesMenu("Parrot Drones");
        parrotDrones.add(new Drone("Anafi", 600, true));
        parrotDrones.add(new Drone("Bepop 2 Power", 400, false));
        parrotDrones.add(new Drone("Bepop 2", 300, false));
        parrotDrones.add(new Drone("Mambo", 150, false));

        DroneComponent restDrones = new DronesMenu("Rest of Drones");
        Drone xiaomi4K = new Drone("Mi4K", 2000, true);
        Drone goPRO_Karma = new Drone("Go_Pro_Karma", 1000, false);
        Drone yeneec = new Drone("Yuneec_Typhoon_H", 1100, false);
        restDrones.add(xiaomi4K);
        restDrones.add(goPRO_Karma);
        restDrones.add(yeneec);

        DroneComponent phantomDrones = new DronesMenu("DJI Phantom serie");
        phantomDrones.add(new Drone("Phantom 1", 500, false));
        phantomDrones.add(new Drone("Phantom 2", 800, false));
        phantomDrones.add(new Drone("Phantom 3", 1200, false));
        phantomDrones.add(new Drone("Phantom 4", 1700, true));

        //Placing phantomDrones into DJI drones. Actually placing menu inside another menu
        djiDrones.add(phantomDrones);

        DroneComponent allDrones = new DronesMenu("All Drones");
        //Pay attention that djiDrones also includes phantomDrones inside and as result also will be printed
        allDrones.add(djiDrones);
        allDrones.add(parrotDrones);
        allDrones.add(restDrones);

        SaleAgent saleAgent1 = new SaleAgent(allDrones);
        //saleAgent1.printAll();
        saleAgent1.printAll_4K_only();

    }
}
