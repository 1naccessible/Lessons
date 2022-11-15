package multistream;

public class MyThreadsDemo2 {
    public static void main(String[] args) {
        MyThreads mt1 = new MyThreads("FirstStream");
        MyThreads mt2 = new MyThreads("SecondStream");
        MyThreads mt3 = new MyThreads("ThirdStream");

            try {

                mt1.join();
                System.out.println("First stream joined");
                mt2.join();
                System.out.println("Second stream joined");
                mt3.join();
                System.out.println("Third stream joined");

            } catch (InterruptedException e) {
                System.out.println(e);
                System.out.println("Main stream stopped");
            }

        System.out.println("Main stream ends");
    }
}
