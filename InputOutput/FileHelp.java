package InputOutput;

import java.io.File;


public class FileHelp {
    public static void main(String[] args) {
        Help helpobj = new Help(new File("C:\\Users\\alexp\\Desktop\\EDC RPG\\ИСЗ\\helpfile.txt"));
        String topic;

        System.out.println("Bocпoльэyйтecь справочной системой.\n" +
                "Для выхода из системы введите 'stop'.");

        do {
            topic = helpobj.getSelection();

            if (!helpobj.helpon(topic)){
                System.out.println("Тема не найдена");
            }

        }while(topic.compareTo("stop") != 0);
    }
}
