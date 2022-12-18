package training;

public class MyPowSol {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1 || n == 0.00001 || x == 1 || n >= 0.00001 && n < 1) {
            return x;
        } else if (n > 1) {
            int counter = 2;
            double multiplayer = x;
            while (counter <= n) {
                counter++;
                x = x * multiplayer;
            }
            return x;
        }
        if (n < 0) {
            int counter = 2;
            n = Math.abs(n);
            double multiplayer = x;
            while (counter <= n) {
                counter++;
                x = x * multiplayer;
            }
            return 1 / x;
        }
        return 0;
    }
}

class MyPowDemo {
    public static void main(String[] args) {
        System.out.println(MyPowSol.myPow(0.00001, 2));
    }
}