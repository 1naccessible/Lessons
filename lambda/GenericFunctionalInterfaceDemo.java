package lambda;
interface SomeTest<T>{
    boolean test(T n, T d);
}
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n,d) -> n % d == 0;
        if (isFactor.test(10,2)){
            System.out.println("2 is divisor for 10");
        }

        SomeTest<Double> isFactorDouble = (n,d) -> n % d == 0;
        if (isFactorDouble.test(212.0,4.0)){
            System.out.println("4.0 is divisor for 212.0 ");
        }

        SomeTest<String> isiN = (a,b) -> a.contains(b);
        if (isiN.test("face", "ace")){
            System.out.println("face contains ace");
        }
    }
}
