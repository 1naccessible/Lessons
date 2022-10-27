package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;


public class FIleCopWriteBinary {
    public static void main(String[] args) throws Exception{
        File fileFromWhichDataWillBeCopied = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\code1.txt");
        File fileIntoWhichDataWillBeWritten = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\code2.txt");

        FileInputStream copiedFileData = new FileInputStream(fileFromWhichDataWillBeCopied);
        FileOutputStream writeDataInFile = new FileOutputStream(fileIntoWhichDataWillBeWritten);

        try {


            byte[] buff = copiedFileData.readAllBytes();

            String s = new String(buff, StandardCharsets.US_ASCII);

            String c = s.replace(" ", "-");

            byte converted[] = c.getBytes();

            System.out.println(c);

            writeDataInFile.write(converted);

            copiedFileData.close();

        } catch (Exception e) {
            System.out.println(e);
        }finally {
            copiedFileData.close();
            writeDataInFile.close();
        }
    }
}
