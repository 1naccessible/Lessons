package InputOutput;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        if (scan.hasNextInt()){
            i = scan.nextInt();
            System.out.println(i);
        }

    }
}
