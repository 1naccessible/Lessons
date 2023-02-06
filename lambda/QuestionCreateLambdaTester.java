package lambda;

import java.util.function.Predicate;

public class QuestionCreateLambdaTester {
    public static void main(String[] args) {
        Predicate<Integer> tester = n -> (n >= 10 && n <= 20);
        System.out.println(tester.test(15));
        System.out.println(tester.test(124));
        System.out.println(tester.test(10));
        System.out.println(tester.test(20));
        System.out.println(tester.test(9));
    }
}
