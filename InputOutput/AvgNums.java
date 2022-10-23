package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int n;
        double sum = 0.0d;
        double avg, t;

        System.out.println("How many numbers do you enter: ");
        str = bf.readLine();

        try {
            n = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println(e);
            n = 0;
        }

        System.out.println("Enter " + n + " values");

        for (int i = 0; i < n; i++) {
            System.out.println(": ");

            str = bf.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (Exception e) {
                System.out.println(e);
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average value" + avg);
    }
}

