package EASF;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class QuadraticSI {
    public static void main(String[] args) {
        double a, b, c, x;
        a = 4;
        b = 1;
        c = -3;

        System.out.println("4x^2 + x - 3 = 0");

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("first root = " + x);

        x = (-b - sqrt(pow(b,2) - 4 * a * c)) / (2 * a);
        System.out.println("second root = " + x);
    }
}
