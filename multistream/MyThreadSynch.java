package multistream;

public class MyThreadSynch implements Runnable {
    Thread thrd;
    static sumArray sa = new sumArray();

    int a[];
    int answer;

    MyThreadSynch(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;

        System.out.println(thrd.getName() + "start");
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum of num array for" + thrd.getName() + ": " + answer);

        System.out.println(thrd.getName() + "end");

    }
}

class MyThreadSynchDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MyThreadSynch mts = new MyThreadSynch("Stream #1", nums);
        MyThreadSynch mts1 = new MyThreadSynch("Stream #2", nums);

        try {
            mts.thrd.join();
            mts1.thrd.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main stream ends");
    }
}