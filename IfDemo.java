public class IfDemo {
    public static void main(String[] args) {
        double x=14;
        double y=13.999;

        if (x<y) System.out.println("This line will not out printed"+x);
        if (x>y) System.out.println("x more than y");

        System.out.println();

        double d=x/y;
        double f=1.01;

        if (d>f) System.out.println("d more than f d="+d);
        if (d<f) System.out.println("d less than f d="+d);
    }
}
