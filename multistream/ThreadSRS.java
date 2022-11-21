package multistream;

public class ThreadSRS implements Runnable {
    Thread thrd;

    boolean suspend;
    boolean stop;

    ThreadSRS(String name) {
        thrd = new Thread(this, name);
        suspend = false;
        stop = false;
        thrd.start();
    }

    synchronized void myStop() {
        stop = true;
        suspend = false;
        notify();
    }

    synchronized void mySuspend(){
        suspend = true;
    }

    synchronized void myResume(){
        suspend = false;
        notify();
    }


    @Override
    public void run() {

        System.out.println(thrd.getName() + " start");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");

                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while (suspend) {
                        wait();
                    }

                    if (stop) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(thrd.getName() + "  exit ");
    }
}


class Suspend{
    public static void main(String[] args) {
        ThreadSRS ob = new ThreadSRS("Stream");

        try {
        Thread.sleep(500);

            ob.mySuspend();
            System.out.println("Пpиocтaнoвкa потока");
            Thread.sleep(1000);
            ob.myResume();
            System.out.println("Boзoбнoвлeниe потока");
            Thread.sleep(1000);
            ob.mySuspend();
            System.out.println("Пpиocтaнoвкa потока");
            Thread.sleep(1000);
            ob.myResume ();
            System.out.println("Boзoбнoвлeниe потока");
            Thread.sleep(1000);
            ob.mySuspend();
            System.out.println("Ocтaнoвкa потока");
            ob.myStop();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        try {
            ob.thrd.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}