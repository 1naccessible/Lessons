public class Queue {
   private int q[];// массив для хранения элементов очереди
    private int putloc, getloc;//индексы для вставки и извлечения элементов очереди соответсвенно

    Queue(int size) {
        q = new int[size + 1]; //выделить память для очереди
        putloc = getloc = 0;
    }

    void put(int ch) {             //поместить элемент в очердь
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    int get() {    //извлечь элемент из очереди
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return 0;
        }

        getloc++;
        return q[getloc];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        //поместить целочисленные символы в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put(i);

        // извлечь буквенные символы из очереди bigQ и отобразить
        System.out.println("Содержимое очереди bigQ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch !=  0) System.out.print(ch +  " ");
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + ( 25 - i));

            smallQ.put( (25 - i));

            System.out.println();
        }
            System.out.println();
            //Дополнительные ошибки при обращении к очереди smallQ
            System.out.println("Содержимое smallQ");
            for (i = 0; i < 5; i++) {
                ch = smallQ.get();
                if (ch != 0)
                    System.out.println(ch);

            }
        }
    }

