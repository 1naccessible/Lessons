package lambda;

import java.net.InterfaceAddress;
import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 == 0;
        if (isEven.test(10)){
            System.out.println("10 is even");
        }
    }
}
