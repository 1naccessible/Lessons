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

        try {
            for (int i = 0; i< 50; i++){
                Thread.sleep(100);
                System.out.print(".");
            }
        }catch (InterruptedException e){
            System.out.println(e);
            System.out.println("Main stream stopped");
        }
        System.out.println("Main stream ends");
    }
}
