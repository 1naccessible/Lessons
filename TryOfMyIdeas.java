public class TryOfMyIdeas {
    public static void main(String[] args) {

        for (int x = 0; x <= 100; x++) {

            System.out.println(x + "%");
        }
        {
            int x, y, c;

            x = y = c = 100;
        }

        {
            double x = 999_999;
            double y = 1;
            long l;
            l = (long) (x / y);
            System.out.println("\n\n\n" + l);
        }
        System.out.println("One \nTwo \nThree");
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }

        {
            int x = 0;
            int y = 10;
            if (x != 0 && (y / x) == 5) System.out.println("division by 0 not executed");
        }
        {
            int x = 0;
            int y = 10;
            if (x != 0 && (y / x) == 5) System.out.println("gg");
        }
        int xa = 3;
        int ca = 3;
        int da;
        da = xa % ca;
        System.out.println(da + "\t\t\t\t\t\t\t222222222222222222");
    }


}
