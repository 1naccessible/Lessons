package InputOutput;

import java.io.*;


public class ShowFile {
    public static void main(String[] args) throws Exception {
        String text = "Some text whose need to write in file \nByte \nRead";

        FileOutputStream test = new FileOutputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt", false);
        FileInputStream inputStream = new FileInputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");

        try(test; inputStream) {
            byte buf[] = text.getBytes();

            test.write(buf);

            int a = 0;
            while (a != -1) {
                int i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                } else break;

            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
