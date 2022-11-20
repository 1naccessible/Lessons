package multistream;

public class TickTock {
    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");

        state = "ticked";

        notify();

        try {
            while (state.equals("toked")) {
                wait();
            }
        }catch (InterruptedException e){
            System.out.println("stream stoped" + e);
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");

        state = "tocked";

        notify();

        try {
            while (state.equals("tiked")) {
                wait();
            }
        }catch (InterruptedException e){
            System.out.println("stream stoped" + e);
        }
    }
}

class TickTockThrd implements Runnable {
    Thread thrd;
    TickTock tito;

    TickTockThrd(String name, TickTock tt) {
        thrd = new Thread(this, name);
        tito = tt;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                tito.tick(true);
            }
            tito.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                tito.tock(true);
            }
            tito.tock(false);
        }
    }
}

class TickTockDemo{
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        TickTockThrd ttt1 = new TickTockThrd("Tick", tt);
        TickTockThrd ttt2 = new TickTockThrd("Tock", tt);

        try {
            ttt1.thrd.join();
            ttt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("stream stopped " + e);
        }
    }
}
