package exception;

public class ExcDemo4 {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] divisors = {2, 0, 4, 2, 0, 12,};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println("num[" + i + "]" + "/ div[" + i + "]" + " = " + num[i] / divisors[i]);
            }
            catch (ArithmeticException exception){
                System.out.println("Повытка деления на ноль");
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Соответствующий элемент не найден");
            }
        }

    }
}
