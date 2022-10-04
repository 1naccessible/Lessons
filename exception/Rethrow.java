package exception;

public class Rethrow {
    public static void genException(){
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
                throw exception;
            }
            catch (Exception exception){
                System.out.println("IT'S CAN'T BE demonstrated");
            }
        }
    }
}

class RethrowDemo{
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Фатальная ошибка - выполнение программы прервано");
        }
    }
}
