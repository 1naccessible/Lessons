package ICharQ;

public class CircularQueue implements ICharQ {
    private char r[];
    private char q[];
    private int getLoc, putLoc;

    public CircularQueue(int size) {
        q = new char[size + 1]; //Задать размер очереди
        putLoc = getLoc = 0; //Установить начальное значение переменным
        r = new char[size + 1];
    }

    public void put(char ch) {  //Поместить символ в очередь
        if (putLoc + 1 == getLoc || ((putLoc == q.length - 1) && (getLoc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putLoc++;
        if (putLoc == q.length) putLoc = 0;
        q[putLoc] = ch;
    }

    public char get() { //Достать символ из очереди
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getLoc++;
        if (getLoc == q.length) getLoc = 0;
        return q[getLoc];
    }

    public void reset(){
        q = r;
    }
}
