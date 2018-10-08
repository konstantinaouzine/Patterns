package Patterns.Pattern_Iterator2;

import java.util.Iterator;

//Creating Iterator class to iterate over Array data structure
public class IteratorParrotMenu implements Iterator {
    private Drone[] drones;
    private int currentPosition;

    public IteratorParrotMenu(Drone[] drones){
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

    public void remove(){
        if (currentPosition<=0)
            throw new IllegalStateException("can't remove item until at least one Next operation performed");
        if (drones[currentPosition-1] != null)
        {
            for (int i = (currentPosition-1) ; i < (drones.length-1) ; i++)
            {
                //when item at specific position of the list should be removed, we continuously copying(moving) items from right of the item
                // for 1 position left until the item that should be removed is covered by another
                drones[i] = drones[i+1];
            }
            //when all items moved left, we may 'delete' the most right position of the list
            drones[drones.length-1] = null;
        }
    }
}
