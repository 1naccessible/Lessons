package InputOutput;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        int i = 10;
        double d = 123.23;
        double sum = i+d;

        pw.println("Use class PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + sum);
        pw.close();
    }
}
