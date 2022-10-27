package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopWritteText {
    public static void main(String[] args) {
        File fileFromWhichDataWillBeCopied = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\code1.txt");
        File fileIntoWhichDataWillBeWritten = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\code2.txt");

        try (BufferedReader copiedFileData = new BufferedReader(new FileReader(fileFromWhichDataWillBeCopied));
             FileWriter writeDataInFile = new FileWriter(fileIntoWhichDataWillBeWritten, true)) {

            do {

                String s = copiedFileData.readLine();
                String c = s.replace(" ", "-");
                writeDataInFile.write(c);

            } while (copiedFileData.readLine() != null);




        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
