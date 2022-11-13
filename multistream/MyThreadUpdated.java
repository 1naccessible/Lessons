package multistream;

public class MyThreadUpdated implements Runnable {
    Thread thrd;

    MyThreadUpdated(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count = " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("stream ends");
    }

}

class MyThreadUpdatedDemo {
    public static void main(String[] args) {
        MyThreadUpdated mt = new MyThreadUpdated("Stream");
        for (int count = 0; count < 50; count++) {
            try {
                System.out.print(".");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Main stream ends");
    }
}