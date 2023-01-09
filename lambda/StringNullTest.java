package lambda;

import java.util.function.Predicate;

public class StringNullTest {
    public static void main(String[] args) {
        String sa = "some";
        Predicate<String> predicate = s -> s != null ;
        System.out.println(predicate.test(sa));
        Predicate<String> predicate1 = s -> !s.equals("");
       // Predicate<String> predicate2 = s -> !s.equals(null) && !s.equals("");
        System.out.println(predicate.and(predicate1).test(sa));

        String jnA = "Job";
        Predicate<String> stringPredicate= s -> s.startsWith("J") && s.endsWith("A");
        System.out.println(stringPredicate.test(jnA));
    }
}
