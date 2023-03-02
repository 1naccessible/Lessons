package collectionsFramework;
import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        System.out.println("integerArrayList - " + integerArrayList);

        Integer[] buff = new Integer[integerArrayList.size()];
        integerArrayList.toArray(buff);

        int sum = 0;
        for (int i = 0; i < buff.length; i++) {
            sum += buff[i];
        }
        System.out.println("sum of elements in array - " + sum);
    }
}
