package Patterns.Pattern_Iterator;

public class IteratorParrotMenu implements Iterator {
    private MenuItem[] drones;
    private int currentPosition;

    public IteratorParrotMenu(MenuItem[] drones){
        this.drones = drones;
        currentPosition = 0;
    }

    @Override
    public Object next() {
        return drones[currentPosition++];
    }

    @Override
    public boolean hasNext() {
        if (currentPosition >= drones.length || drones[currentPosition] == null)
            return false;
        else
            return true;
    }
}
