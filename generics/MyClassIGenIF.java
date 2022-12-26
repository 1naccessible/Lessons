package generics;

public class MyClassIGenIF <T, V extends T> implements IGenIF<T,V>{
    T ob;
    V ob1;

    @Override
    public void set(T o, V o1) {
        ob = o;
        ob1 = o1;
    }
}

class Counter<T>{
    Counter(T ob){

    }
}

class CounterDemo{
    public static void main(String[] args) {
        Counter raw = new Counter(new Double(56.0));
    }
}