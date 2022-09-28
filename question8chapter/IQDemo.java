package question8chapter;
import interfaceDemonstrate.*;

public class IQDemo {
    public static void main(String[] args) {
       byTwos ob = new byTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nreset");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nStart value is 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }
    }
}
