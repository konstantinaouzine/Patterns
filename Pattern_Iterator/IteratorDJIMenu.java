package Patterns.Pattern_Iterator;

import java.util.ArrayList;

public class IteratorDJIMenu implements Iterator{
    private ArrayList<MenuItem> drones;
    private int currentPosition;

    public IteratorDJIMenu(ArrayList drones){
        this.drones = drones;
        currentPosition = 0;
    }

    @Override
    public Object next() {
        return drones.get(currentPosition++);
    }

    @Override
    public boolean hasNext() {
        if (currentPosition<drones.size())
            return true;
        else
            return false;
    }
}
