package lambda;

interface MyFunction<T>{
    T func(T t);
}
public class Factorial {
    public static void main(String[] args) {

        MyFunction<Integer> myFunction = n -> {
            int answer = 0;
            for (int i = 0; i <= n; i++) {
                answer += i;
            }

            return answer;
        };

        System.out.println(myFunction.func(20));
    }
}
