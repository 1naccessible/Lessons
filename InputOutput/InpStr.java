package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InpStr {
    public static void main(String[] args) {
          String location = InpStr.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        try (FileInputStream file = new FileInputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt")){
            Scanner sc = new Scanner(file);
            while(sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
