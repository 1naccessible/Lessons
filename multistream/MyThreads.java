package multistream;

public class MyThreads extends Thread {
    MyThreads(String name){
        super(name);
        start();
    }

    public void run(){
        try{
            for (int count = 0; count<10; count++){
                System.out.println("In " + getName() + " - counter = " + count);
                sleep(400);
            }
        }catch (InterruptedException e){
            System.out.println(e);
            System.out.println(getName() + " stream stopped");
        }
        System.out.println(getName() + "stream ends");
    }
}

class MyThreadsDemo{
    public static void main(String[] args) {
        MyThreads mt1 = new MyThreads("FirstStream");
        MyThreads mt2 = new MyThreads("SecondStream");
        MyThreads mt3 = new MyThreads("ThirdStream");
do {
    try {
        Thread.sleep(100);

    } catch (InterruptedException e) {
        System.out.println(e);
        System.out.println("Main stream stopped");
    }
}while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
        System.out.println("Main stream ends");
    }
}
