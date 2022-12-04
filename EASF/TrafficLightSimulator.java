package EASF;

public class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean change = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case RED -> Thread.sleep(10000);
                    case GREEN -> Thread.sleep(12000);
                    case YELLOW -> Thread.sleep(4000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch (tlc){
            case RED -> tlc = TrafficLightColor.YELLOW;
            case YELLOW -> tlc = TrafficLightColor.GREEN;
            case GREEN -> tlc = TrafficLightColor.RED;
        }
        change = true;
        notify();
    }

    synchronized void waitForChange(){
        try {
            while (!change) {
                wait();
            }
            change = false;
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    TrafficLightColor getColor(){
        return tlc;
    }

    void cancel(){
        stop = true;
    }
}