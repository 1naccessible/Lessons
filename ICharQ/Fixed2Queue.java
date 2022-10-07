package ICharQ;

public class Fixed2Queue {
    private char q[]; //Массив для хранения элементов очереди
    private char r[];
    private int putLoc, getLoc; //Индексы всталяемых и извлекаемых елементов

    //Создать пустую очередь заданного размера
    public Fixed2Queue(int size) {
        q = new char[size - 1]; // Выделить память для очереди
        putLoc = getLoc = 0;
        r = new char[size - 1];
    }

    //Поместить символ в очередь
    public void put(char ch) throws QueueFullException {
        if (putLoc == q.length - 1) {
            throw new QueueFullException(q.length - 1);
        }

        putLoc++;
        q[putLoc] = ch;
    }

    //Извлечт символ из очереди

    public char get() throws QueueEmptyException {
        if (getLoc == putLoc) {
            throw new QueueEmptyException();
        }

        getLoc++;
        return q[getLoc];
    }

    public void reset() {
        q = r;
    }
}

class Fixed2QueueDemo {
    static void cop(char x, char y, char u) {

    }

    public static void main(String[] args) {
        char ch;
        int i;


        Fixed2Queue iQ = new Fixed2Queue(12);


        try {
            for (i = 0; i < 13; i++) {
                iQ.put((char) ('A' + i));
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println("Содержимое фиксированной очереди: ");
        try {
            for (i = 0; i < 11; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}