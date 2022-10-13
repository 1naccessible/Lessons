package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ShowFile {
    public static void main(String[] args) {
        String text = "Some text whose need to write in file";
        try {
            FileOutputStream test = new FileOutputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt", false);
            byte buf[] = text.getBytes();
            test.write(buf);
            FileInputStream inputStream = new FileInputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");

                test.close();
                Scanner sc = new Scanner(inputStream);

                while (sc.hasNext()){
                    System.out.print(sc.next() + "\r\n");
                }


        }catch (Exception e){
            System.err.print(e.getMessage());
        }
    }
}
