package lambda;

interface NumericTest {
    boolean test(int d, int m);
}

public class NumericTestDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("10 является делителем 2");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("10 не является делителем 3");
        }
        System.out.println();


        NumericTest lessThan = (n, d) -> (n < d);

        if (lessThan.test(2, 10)) {
            System.out.println("2 меньше 10");
        }
        if (!lessThan.test(10, 2)) {
            System.out.println("10 не меньше 2");
        }
        System.out.println();


        NumericTest absEqual = (n, d) -> (Math.abs(n) == Math.abs(d));

        if (absEqual.test(4, -4)) {
            System.out.println("Абсолюные величины 4 и -4 равны");
        }
        if (!absEqual.test(4, -5)) {
            System.out.println("Абсолютные величины 4 и -5 не равны");
        }
        System.out.println();

        // Так же можно хранить разные ссылки на методы в одной переменной
//        NumericTest test = (n, d) -> (Math.abs(n) == Math.abs(d));
//        test = (n, d) -> (n % d) == 0;
//        test = (n, d) -> (Math.abs(n) == Math.abs(d));

    }
}
