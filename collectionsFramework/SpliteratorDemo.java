package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (double i = 2.0; i <= 12.0; i++) {
            list.add(i);
        }
        Spliterator<Double> spliterator = list.spliterator();
        while (spliterator.tryAdvance(System.out::println));

        spliterator = list.spliterator();
        List<Double> sqrt = new ArrayList<>();
        while (spliterator.tryAdvance(n -> sqrt.add(Math.sqrt(n))));

        System.out.println();
        spliterator = sqrt.spliterator();
        spliterator.forEachRemaining(System.out::println);

    }
}
