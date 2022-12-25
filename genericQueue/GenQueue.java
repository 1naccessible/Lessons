package genericQueue;

import ICharQ.QueueEmptyException;
import ICharQ.QueueFullException;

public class GenQueue {
    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];
        QueueRealization<Integer> q = new QueueRealization<>(iStore);

        int iVal;

        System.out.println("демонстрация очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " in queue");
                q.put(i);
            }
        }catch (QueueFullException e){
            System.out.println(e);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Get next Integer type number from queue q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException e){
            System.out.println(e);
        }

        System.out.println();

            //Creating queue for saving numbers type Double/Float
        Double[] dStore = new Double[10];
        QueueRealization<Double> q2 = new QueueRealization<>(dStore);

        double dVal;

        System.out.println("Demonstrating double type queue q2: ");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i/2 + " in queue q2") ;
                q2.put((double) i/2);
            }
        }catch (QueueFullException e){
            System.out.println(e);
        }

        try {
            for (int i = 0; i < 5; i++) {
                dVal = q2.get();
                System.out.println("Get next Double type number from queue q2: ");
                System.out.println(dVal);
            }
        }catch (QueueEmptyException e){
            System.out.println(e);
        }
    }
}
