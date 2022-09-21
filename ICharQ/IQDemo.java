package ICharQ;

public class IQDemo {
    static void cop(char x, char y, char u){

    }
    public static void main(String[] args) {


        FixedQueue q1 = new FixedQueue(12);
        DynQueue q2 = new DynQueue(10);
        CircularQueue q3 = new CircularQueue(10);
        ICharQ iQ;
        char ch;
        int i;


        iQ = q1;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        q1.reset();

        System.out.println("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();


        iQ = q2;

        System.out.println("Содержимое динамической очереди: ");
        for (i = 0; i < 11; i++) {
            iQ.put((char) ('Z' - i));
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.println("Содерживое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди");

        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

    }
}
