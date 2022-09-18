package ICharQ;

//Класс реализующий очередь фиксированного размера
//для хранения символов
public class FixedQueue implements ICharQ {
    private char q[]; //Массив для хранения элементов очереди
    private int putLoc, getLoc; //Индексы всталяемых и извлекаемых елементов

    //Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size - 1]; // Выделить память для очереди
        putLoc = getLoc = 0;
    }

    //Поместить символ в очередь
    public void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putLoc++;
        q[putLoc] = ch;
    }

    //Извлечт символ из очереди
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getLoc++;
        return q[getLoc];
    }
}
