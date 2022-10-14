package InputOutput;

import java.io.IOException;
import java.io.PrintStream;

public class PrntStream {

    public static void main(String[] args) throws IOException {
        PrintStream file = new PrintStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code2.txt");
        String s = "Some text whose need to write in file\n";
        byte buf[] = s.getBytes();
        try (file){
            file.print(s);
            file.write(buf);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
