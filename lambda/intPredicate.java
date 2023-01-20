package lambda;

public interface intPredicate {
    boolean test(int n);
}

class MyIntPredicate {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo{
    static boolean numTest(intPredicate s, int n){
        return s.test(n);
    }

    public static void main(String[] args) {
        boolean result;
        result = numTest(MyIntPredicate::isPrime, 17);
        if (result){
            System.out.println("17 - simple number");
        }

        result = numTest(MyIntPredicate::isEven, 12);
        if (result){
            System.out.println("12 - even number");
        }

        result = numTest(MyIntPredicate::isPositive, 123);
        if (result){
            System.out.println("123 - positive number");
        }
    }
}
