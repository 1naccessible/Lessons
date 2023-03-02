package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
         stringLinkedList.add("A");
        stringLinkedList.add("B");
        stringLinkedList.add("C");
        stringLinkedList.add("D");
        stringLinkedList.add("F");
        stringLinkedList.add("R");
        stringLinkedList.add(1, "A2");

        System.out.println("stringLinkedList size - " + stringLinkedList.size() );
        System.out.println("stringLinkedList - " + stringLinkedList);

        stringLinkedList.remove("B");
        stringLinkedList.remove(4);
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();

        System.out.println("stringLinkedList size - " + stringLinkedList.size() );
        System.out.println("stringLinkedList - " + stringLinkedList);

        stringLinkedList.set(1, stringLinkedList.get(stringLinkedList.size()-1));

        System.out.println("stringLinkedList - " + stringLinkedList);

    }
}
