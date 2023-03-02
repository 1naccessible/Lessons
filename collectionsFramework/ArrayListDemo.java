package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add(1,"A2");
        System.out.println("arrayList size: " + stringList.size());

        System.out.println("arrayList contains: " + stringList);

        stringList.remove("F");
        stringList.remove(4);

        System.out.println("arrayList size after remove 2 elements - " + stringList.size() +
                "\n arrayList - " + stringList );
    }
}
