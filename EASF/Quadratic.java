package EASF;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("4x^2 + x - 3 = 0");
        double a, b, c, x;
        a = 4;
        b = 1;
        c = -3;

        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("first root = " + x);

        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("second root = " + x);
    }
}
