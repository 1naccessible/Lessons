public class DoubleExample {
    /*
        Демострация различий между double и int
     */
    public static void main(String args[]) {
        int var=10;
        double x=10.0;
        System.out.println("First value of var "+var);
        System.out.println("First value of x "+x);
        System.out.println();
        var=var/4;
        x=x/4;
        System.out.println("Second value of var "+var);
        System.out.println("Second value of x "+x);
    }
}
