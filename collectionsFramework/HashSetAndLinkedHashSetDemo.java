package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAndLinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<String> stringLinkedSet = new LinkedHashSet<>();
        stringSet.add("Alpha");
        stringSet.add("Beta");
        stringSet.add("Gamma");
        stringSet.add("Delta");
        stringSet.add("Omega");
        stringLinkedSet.add("Alpha");
        stringLinkedSet.add("Beta");
        stringLinkedSet.add("Gamma");
        stringLinkedSet.add("Delta");
        stringLinkedSet.add("Omega");

        System.out.println("Set - " + stringSet);
        System.out.println("LinkedSet - " + stringLinkedSet);
    }
}
