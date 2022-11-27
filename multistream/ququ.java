package multistream;

class Ex {
    private int[] org;
    private int[] i;
    private int getter;
    private int getCounter;
    private int setter;
    Ex obj;
    Thread thread;

    Ex(int[] q) {
        org = q;
        getCounter = q.length - 1;
        setter = 0;
        i = new int[q.length];
    }

    synchronized void get() {
        for (int x : i) {
            try {
                thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            getter = x;
            System.out.println(getter);
            getCounter--;

        }
    }

    synchronized public void setI() {
        for (int co : org) {
            i[setter] = co;
            setter++;
        }
    }
}

public class ququ implements Runnable {
    Thread thread;
    Ex obj;

    ququ(String name, Ex ob) {
        obj = ob;
        thread = new Thread(this, name);
        thread.start();
    }


    public void run() {
        if (thread.getName().compareTo("StreamSetter") == 0) {

            obj.setI();

        } else {

            try {
                thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            obj.get();

        }
    }
}

class QuquDemo {
    public static void main(String[] args) throws InterruptedException {
        int[] i = {1, 2, 34, 56, 12, 7, 5, 9, 10};

        Ex ob = new Ex(i);
        ququ str1 = new ququ("StreamSetter", ob);


        ququ str2 = new ququ("StreamGetter", ob);


    }
}