package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    public static void main(String[] args) {
        System.out.println("ReadLines");
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write string. End stream - line \"stop\"");
        try {
            do {
                c = br.readLine();
                System.out.println(c);
            } while (!c.equals("stop"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

