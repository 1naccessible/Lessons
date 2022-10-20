package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) throws Exception {
        String str;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Пpизнaк конца ввода - строка 'stop' ");

        File file = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");
        try (FileWriter fw = new FileWriter(file, false)){


            do {
                System.out.println(": ");
                str = bfr.readLine();

                if (str.compareTo("stop") == 0) {
                    break;
                }

                fw.write(str);
            } while (str.compareTo("stop") != 0);
        }
    }
}