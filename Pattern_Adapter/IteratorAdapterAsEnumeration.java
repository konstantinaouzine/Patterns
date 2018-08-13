package Pattern_Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapterAsEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorAdapterAsEnumeration(Iterator iterator)
    {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
