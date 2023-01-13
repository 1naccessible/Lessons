package lambda;

interface NumericFunc {
    int func(int i);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc smallestFunc = n -> {
            n = Math.abs(n);
            for (int i = 2; i < n / i; i++) {
                if (n % i == 0) {
                    return i;
                }
            }
            return 1;
        };
        System.out.println("Наименьшим делителем 12 являеться - " + smallestFunc.func(12));
        System.out.println();

        System.out.println("Наименьшим делителем 11 являеться - " + smallestFunc.func(11));

    }
}
