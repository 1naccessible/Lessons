package generics;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Gen test");
        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getOb();
        System.out.println("value d = " + d);

        // Использование базового типа может привести
        // к исключениям времени выполнения. Соответствующие
        // примеры представлены ниже.
        // Следующее приведение типов вызывает ошибку
        // времени выполнения !
        // int i = (Integer) raw.getOb(); // ошибка времени выполнения

        // Это присваивание нарушает безопасность типов Безопасность
        strOb = raw; // допустимо, но потенциально неверно
        // String str = strOb. getOb () ; - ошибка времени выполнении не проверяется

        // Следующее присваивание также нарушает безопасность типов
        raw = iOb; // допустимо, но потенциально неверно
        // d = (Double) raw.getOb(); // ошибка времени выполнения
    }
}
