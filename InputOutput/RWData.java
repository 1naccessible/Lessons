package InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt", false))){
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Записано:" + 12.5*12.44);
            dataOut.writeDouble(12.5*12.44);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println();

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt"))){
            i = inputStream.readInt();
            System.out.println(i);

            d = inputStream.readDouble();
            System.out.println(d);

            b = inputStream.readBoolean();
            System.out.println(b);

            d = inputStream.readDouble();
            System.out.println(d);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
