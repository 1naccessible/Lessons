package exception;

public class NestTrys {
    public static void main(String[] args) {

        int[] num = {2, 8, 16, 32, 64, 128, 256, 512,1024};
        int[] divisors = {0, 0, 4, 2, 0, 12};
        try {//Внешний блок try
            for (int i = 0; i < num.length; i++) {
                try {//Внутренний блок try
                    System.out.println("num[" + i + "]" + "/ div[" + i + "]" + " = " + num[i] / divisors[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Попытка деления на ноль");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Соответствующий элемент не найден");
            System.out.println("Фатальная ошибка - выполнение программы прервано");

        }
    }
}
