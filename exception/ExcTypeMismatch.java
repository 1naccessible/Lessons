package exception;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int num[] = new int[4];
        try {
            num[7] = 10;
            System.out.println("This massage won't be displayed");
        }
        catch (ArithmeticException exc){
            System.out.println("This massage won't be displayed");
        }
        System.out.println("This massage won't be displayed");
    }
}
