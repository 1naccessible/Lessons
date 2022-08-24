public class SimpleNumbers {
    public static void main(String args[]) {

        int x;
        for (x = 2; x <= 100; x++) {
            if ((x % x) == 0 & (x % 2) != 0 & (x % 3) != 0 & (x % 5) != 0 & (x % 7) != 0)
            {
                System.out.println(x + " - Простое число");
            }
        }
    }
}








