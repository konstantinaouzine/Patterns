package Patterns.Pattern_Composite;

import java.util.ArrayList;

public class SaleAgent {
    private DroneComponent droneMenus;

    public SaleAgent(DroneComponent droneMenus)
    {
        this.droneMenus = droneMenus;
    }

    public void printAll(){
            droneMenus.print();
    }

    public void printAll_4K_only(){
        droneMenus.print4K_only();
    }
}

