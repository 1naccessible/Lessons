package lambda;
interface ArrayInLambdaInterface<T>{
    void transformation(T[] a);
}
public class ArraysInLambdaParametersDemo {
    public static void main(String[] args) {
        Double[] buff = {1.0, 2.0, 3.0, 4.0};
        ArrayInLambdaInterface<Double> transform = (v) -> {
            for (int i = 0; i < v.length; i++) {
                v[i] = Math.sqrt(v[i]);
                System.out.println(v[i]);
            }
        };
        transform.transformation(buff);
    }
}
