package SelfPrograms.ArrayList;

import java.util.ArrayList;

public class FetchData {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Iterating using a for-each loop

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Iterating using a for-each loop

        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

    }
}
