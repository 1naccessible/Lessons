package exception;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Стандартное сообщение:");
            System.out.println(exception); //Передаю методу println обьект исключение тем самым вызываю метод toString
            System.out.println("\nСтек вызовов:");
            exception.printStackTrace();
        }
    }
}
