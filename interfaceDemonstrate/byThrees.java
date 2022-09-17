package interfaceDemonstrate;

//еще одна реализация интерфейса Series

public class byThrees implements Series {
    int start;
    int val;

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
