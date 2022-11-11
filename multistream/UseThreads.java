package multistream;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Start one stream");
        //Firstly create one stream type MyThread
        MyThread mt = new MyThread("Child #1");

        //Then form a stream based on this object
        Thread newThread = new Thread(mt);

        //Finally, start executing the stream
        newThread.start();

        for (int i = 0; i < 2; i++) {
            System.out.println(".");
            try {
                Thread.sleep(0);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Conclusion of main stream");
    }
}
