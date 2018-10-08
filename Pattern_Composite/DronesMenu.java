package Patterns.Pattern_Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class DronesMenu extends DroneComponent {
    ArrayList<DroneComponent> droneComponents;
    String name;

    public DronesMenu(String name) {
        this.droneComponents = new ArrayList<DroneComponent>();
        this.name = name;
    }

    @Override
    public void add(DroneComponent menuComponent) {
        droneComponents.add(menuComponent);
    }

    @Override
    public void remove(DroneComponent menuComponent) {
        droneComponents.remove(menuComponent);
    }

    @Override
    public DroneComponent getChild(int i) {
        return droneComponents.get(i);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        //Printing company name before iterating over all models
        System.out.println("-----" + name + "-----");

        Iterator iterator = droneComponents.iterator();
        while(iterator.hasNext())
        {
            DroneComponent droneComponent = (DroneComponent) iterator.next();
            droneComponent.print();
        }
    }

}
