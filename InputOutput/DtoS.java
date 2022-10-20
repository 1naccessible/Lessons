package InputOutput;

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;
        File file = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while((s = reader.readLine()) != null){
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
