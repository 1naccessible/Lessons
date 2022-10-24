package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Help {
    File cfile;

    Help(File file) {
        cfile = file;
    }

    //Отобразить справочную информацию по указаной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        //Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(cfile))) {
            do {
                ch = helpRdr.read();

                //Проверить совпадают ли темы
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0){
                        do{
                        //Найти тему
                        info = helpRdr.readLine();
                        if (info != null) {
                            System.out.println(info);
                        }
                        }while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            }while(ch != 1);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return false; // Тема не найдена
    }
    //Получить тему справки
    String getSelection(){
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Укажите тему");
        try {
            topic = br.readLine();
        }catch (Exception e){
            System.out.println(e);
        }
        return topic;
    }
}

