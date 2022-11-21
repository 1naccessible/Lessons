package multistream;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();

        System.out.println(thrd.getName() + " - Name of stream");

        System.out.println(thrd.getPriority() + " - Priority");

        System.out.println();

        //set name and priority to main stream

        thrd.setName("MainStream");

        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("New name of main stream: " + thrd.getName());

        System.out.println("New priority of main stream: " + thrd.getPriority());

    }
}
