package SelfPrograms.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FetchDataUsingIterator {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Iterating using an iterator
        Iterator<String> iter = list.iterator();

        while ( iter.hasNext() ) {                      
            System.out.println(iter.next());
        }

    }

}
