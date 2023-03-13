package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);

        System.out.println();
        Iterator<Integer> integerIterator = integerList.listIterator();
        while(integerIterator.hasNext()){
            int element = integerIterator.next();
            System.out.print(element + " ");
        }

        ListIterator<Integer> listIterator = integerList.listIterator();
        while(listIterator.hasNext()){
            int element = listIterator.next();
            listIterator.set(element+1);
        }

        System.out.println();
        listIterator = integerList.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }

        System.out.println();
        listIterator = integerList.listIterator(integerList.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
