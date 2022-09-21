package ICharQ;

public class DynQueue implements ICharQ {
    private char q[];
    private char r[];
    private int getLoc, putLoc;

    public DynQueue(int size) {
        q = new char[size + 1];
        getLoc = putLoc = 0;
        r = new char[size + 1];
    }

    public void put(char ch) { //Поместить символ в очередь
        if (putLoc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];

                q = t;
            }

        }
        putLoc++;
        q[putLoc] = ch;

    }

    public char get(){
        if (getLoc == putLoc){
            System.out.println(" - Очередь пуста");

            return (char) 0;
        }

        getLoc++;
        return q[getLoc];
    }
    public void reset(){
        q = r;
    }
}
