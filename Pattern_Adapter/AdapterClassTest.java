package Pattern_Adapter;

import java.util.ArrayList;
import java.util.Vector;

public class AdapterClassTest {
    public static void main(String[] args) {
        IteratorAdapterAsEnumeration iteratorAdapterAsEnumeration =
                new IteratorAdapterAsEnumeration(new ArrayList<>().iterator());
        System.out.println(iteratorAdapterAsEnumeration.hasMoreElements());

        EnumerationAdapterAsIterator enumerationAdapterAsIterator = new EnumerationAdapterAsIterator(new Vector().elements());
        System.out.println(enumerationAdapterAsIterator.hasNext());
    }
}
