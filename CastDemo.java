public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        int i;
        byte b;
        char ch;

        x=10;
        y=3;
        i=(int) (x/y);
        System.out.println("result of degree x/y = " + i);

        i = 100;
        b = (byte) i;
        System.out.println("result of transformation from int to byte = " + b);

        i = 257;
        b = (byte) i;
        System.out.println("result of transformation from int to byte = " + b);

        b= 88;
        ch = (char) b;
        System.out.println("ch: " + ch);


    }
}
