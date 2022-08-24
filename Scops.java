public class Scops {
    public static void main(String[] args) {
        int x = 10, y = 2;

        if (y != 0 && (x % y) == 0) System.out.println("everything will be fine \n" + y + " is a divisor " + x);

        y = 0;

        if (y != 0 && (x % y) == 0) System.out.println("everything will be fine \n" + y + " is a divisor " + x);

        if (y != 0 & (x % y) == 0) System.out.println("everything will be fine \n" + y + " is a divisor " + x);
    }
}
