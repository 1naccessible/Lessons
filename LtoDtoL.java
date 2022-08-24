public class LtoDtoL {
    public static void main(String[] args) {
        {
            long x = 999_999L;
            double y;

            y = x;
            if (y == x)
                System.out.println("transformation from data type long to double was successfully completed " + y);
        }

        {
            double x = 999_999;
            long y= 1;
            //y = x;
            if (y != x)
                System.out.println("transformation from data type double to long wasn't successfully completed " + y);
        }
    }

}
