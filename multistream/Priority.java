package multistream;

public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thrd.getName() + " - start");
        do {
            count ++;
            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " - ends");
    }
}

class PriorityDemo{
    public static void main(String[] args) {
        Priority m1 = new Priority("#7 High Priority\n");
        Priority m2 = new Priority("#3 Low Priority\n");

        m1.thrd.setPriority(7);
        m2.thrd.setPriority(3);

        m1.thrd.start();
        m2.thrd.start();

        try {
            m1.thrd.join();
            m2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Основной поток был прерван из за ошибки" + e);
        }
        System.out.println(m1.thrd.getName() + " - counter = " + m1.count);
        System.out.println(m2.thrd.getName() + " - counter = " + m2.count);

        System.out.println("Main stream ends");
    }
}
