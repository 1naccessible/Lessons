package exception;

public class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Полученно: " + what);

        try {
            switch (what) {
                case 0:
                    t = 10 / what; // Сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; // Сгенерировать ошибку обращения к массиву
                    break;
                case 3:
                    return; // выйти из блока try
            }
        } catch (ArithmeticException exception) {
            System.out.println("null is cant be divisor");
            return;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("element is not founded");
        } finally {
            System.out.println("Выход из блока try");
        }
    }
}
