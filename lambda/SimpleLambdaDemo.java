package lambda;

interface MyValue {
    double myValue();
}

interface MyParamValue {
    double myParamValue(int d);
}

public class SimpleLambdaDemo {
    public static void main(String[] args) {
        MyValue myValue = () -> 98.6;

        MyParamValue myParamValue = n -> 1.0 / n;

        System.out.print("Постоянное значение: ");
        System.out.println(myValue.myValue());

        System.out.print("Обратная величина 4: ");
        System.out.println(myParamValue.myParamValue(4));

        System.out.print("Обратная величина 8: ");
        System.out.println(myParamValue.myParamValue(8));


    }
}
