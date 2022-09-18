package ICharQ;

public class CircularQueue implements ICharQ {
    private char q[];
    private int getLoc, putLoc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    public void put(char ch) {
        if (putLoc + 1 == getLoc | ((putLoc == q.length - 1) & (getLoc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putLoc++;
        if (putLoc == q.length) putLoc = 0;
        q[putLoc] = ch;
    }

    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getLoc++;
        if (getLoc == q.length) getLoc = 0;
        return q[getLoc];
    }
}
