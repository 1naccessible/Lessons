package JavaStart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class video44 {
    public static void main(String[] args) {
        int a = 44;
        int b = 55;
        int c = 66;
        int d = 66;

        List<Integer> integerList = new ArrayList<>();
        integerList.add(a);
        integerList.add(b);
        integerList.add(c);
        integerList.add(d);
        System.out.println(integerList);

        Set<Integer> setInt = new HashSet<>(integerList);
        Set<Number> numbers = new HashSet<>(setInt);
        System.out.println(numbers.contains(55));
        System.out.println(setInt);

    }
}
