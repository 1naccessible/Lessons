package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CompFiles {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");
        File file2 = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code2.txt");

        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2)){
            int i = f1.read();
            int b = f2.read();

            System.out.println("file1: " + i);
            System.out.println("file2: " + b);

            if (i!=b){
                System.out.println("Different files");
            }else System.out.println("The same files");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
