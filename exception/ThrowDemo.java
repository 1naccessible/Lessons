package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before operator throw");
            throw new Exception();
        }catch (Exception exception){
            System.out.println("Exception detected");
        }
        System.out.println("After try/catch block");
    }
}
