package InputOutput;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        File file = new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\Code1.txt");

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("Найти первое значение: " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Найти второе значение: " + d);

            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Найти четвертое значение: " + d);

            System.out.println();

            System.out.println("Чтение значений с нечетным порядковым номером");
            for (int i = 0; i < data.length; i+=2) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }


        } catch (Exception e) {
            System.out.println();
        }
    }
}
//Поскольку для хранения значений типа double требует 8 байт, каждое последующие значение начинаеться на 8  байтовой
//границе. Метод seek устанавливает метку по позиции байтов указаных в параметре метода