package multistream;

public class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + "Start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println("In" + thrdName + "counter: " + count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(thrdName + "End");
    }
}


