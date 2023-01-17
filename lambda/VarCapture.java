package lambda;

import java.util.function.Function;

public class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        Function<Integer, Integer> myFunc = (n) -> {
            // Такое использование переменной num корректно, поскольку
            // ее значения не изменяется
            int v = num + n;
            //num++; - некоректно так как переменная захваченна
            return v;
        };

        // Приведенная ниже строка породила бы ошибку, поскольку она
        // лишает num статуса финальной переменной
        // num = 9;
    }
}