package interfaceDemonstrate;

public class byTwos implements Series {
    int start;
    int val;
    int prev;

    byTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrev(){    //Добовление метода необьявленного в интерфейсе Series
        return prev;
    }
}

class byTwosDemo extends byTwos {
    public static void main(String[] args) {
        byTwosDemo ob = new byTwosDemo();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nreset");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nStart value is 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }
    }

}
