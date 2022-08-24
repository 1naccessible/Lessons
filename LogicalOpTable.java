public class LogicalOpTable {
    public static void main(String[] args) {
        {
            boolean x, y;

            System.out.println("X\t\tY\t\tAND\t\tOR\t\tXOR\t\tNOT\n");

            x = true;
            y = true;
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x ^ y) + "\t" + (!x));

            x = true;
            y = false;
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x ^ y) + "\t" + (!x));

            x = false;
            y = true;
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x ^ y) + "\t" + (!x));

            x = false;
            y = false;
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x ^ y) + "\t" + (!x));
        }
        {
            byte x,y;
            System.out.println("\nX\t\tY\t\tAND\t\tOR\t\tXOR\t\tNOT\n");

            {
                byte x1=0;
                x = 1;
                if (x==0) x1=1;
                y = 1;
                System.out.println(x + "\t\t" + y + "\t\t" + (x & y) + "\t\t"
                        + (x | y) + "\t\t" + (x ^ y) + "\t\t" + x1);
            }
            {
                byte x1=0;
                x = 1;
                if (x==0) x1=1;
                y = 0;
                System.out.println(x + "\t\t" + y + "\t\t" + (x & y) + "\t\t"
                        + (x | y) + "\t\t" + (x ^ y) + "\t\t" + x1);
            }
            {
                byte x1=0;
                x = 0;
                if (x==0) x1=1;
                y = 1;
                System.out.println(x + "\t\t" + y + "\t\t" + (x & y) + "\t\t"
                        + (x | y) + "\t\t" + (x ^ y) + "\t\t" + x1);
            }
            {
                byte x1=0;
                x = 0;
                if (x==0) x1=1;
                y = 0;
                System.out.println(x + "\t\t" + y + "\t\t" + (x & y) + "\t\t"
                        + (x | y) + "\t\t" + (x ^ y) + "\t\t" + x1);
            }
        }




    }
}
