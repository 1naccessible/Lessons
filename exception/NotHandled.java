package exception;

public class NotHandled {
    public static void main(String[] args) {
        int num[] = new int[4];

        num[7] = 10;

        System.out.println("This massage won't be displayed");
    }
}
