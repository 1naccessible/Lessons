package lambda;

public interface MyTest<T extends Number> {
    boolean testing(T t);
}

class MyTestDemo {
    public static void main(String[] args) {
        MyTest<Integer> myTest = integer -> (integer % 2) == 0;

        if (myTest.testing(10)){
            System.out.println("MyTest interface is working");
        }
    }
}