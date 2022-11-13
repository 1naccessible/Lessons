package multistream;

public class MyThreadExThread extends Thread {
    MyThreadExThread(String name) {
        super(name); // Вызвать вариант конструктора класса Thread для присваивания имени потоку
        start();
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            try {
                System.out.println("In " + getName() + " - counter = " + count);
                sleep(400);
            } catch (InterruptedException e) {
                System.out.println(getName() + " stopped ");
            }
        }
        System.out.println(getName() + " ends");
    }
}

class MyThreadExThreadDemo {
    public static void main(String[] args) {
        MyThreadExThread mt = new MyThreadExThread("Stream");

        for (int count = 0; count < 50; count++) {
            try {
                System.out.print(".");
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Main stream stopped");
            }
        }
        System.out.println("Main stream ends");
    }
}
