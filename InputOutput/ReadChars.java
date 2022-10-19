package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        System.out.println("ReadChars");
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write symbols. End stream - symbol - \".\"");

        do {
            c = (char) br.read();
            System.out.print(c);
        }while (c != '.');
    }
}

