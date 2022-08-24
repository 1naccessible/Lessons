public class ScopeOfVariables {
    public static void main(String[] args) {
        int x = 20;

        if (x > 0) {
            int y = 15;
            int b = x * y;
            System.out.println("x * y = " + b);

        }
        System.out.println("x = " + x + "\ny != cose y location in other block " + "\nb != cose location in other block");
        System.out.println("\n\n\n\n");
        System.out.println("Demo work of % arifmetic operation");
        int SS = 10;
        int S1 = 3;
        double aaa = SS % S1;
        int aa = SS % S1;
        System.out.println("double result = " + aaa + "\nint result = " + aa);

    }

    int SS = 10;
    int S1 = 3;
}
