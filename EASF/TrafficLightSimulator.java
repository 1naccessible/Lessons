package EASF;

public class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor currentColor = TrafficLightColor.YELLOW;
    private int tlc;
    private boolean stop = false;
    private boolean change = false;

    TrafficLightSimulator(int init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED.ordinal();

        thrd = new Thread(this);
        thrd.start();

    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(currentColor.getDelay());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){

            if(tlc == TrafficLightColor.RED.ordinal()){
                tlc = TrafficLightColor.YELLOW.ordinal();
                currentColor = TrafficLightColor.YELLOW;
            }else if (tlc == TrafficLightColor.YELLOW.ordinal()){
                tlc = TrafficLightColor.GREEN.ordinal();
                currentColor = TrafficLightColor.GREEN;
            }else {
                tlc = TrafficLightColor.RED.ordinal();
                currentColor = TrafficLightColor.RED;
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
        return currentColor;
    }

    void cancel(){
        stop = true;
    }
}