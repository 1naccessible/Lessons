package lambda;
interface StringTest{
    boolean stringTest(String firstS, String secondS);
}
public class SimpleLambdaDemo2 {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.contains(b);

        String test = "Is in";

        if (isIn.stringTest(test, "in")){
            System.out.println("Substring <in> founded");
        } else {
            System.out.println("Substring <in> isn't founded");
        }

        if (isIn.stringTest(test, "XYR")){
            System.out.println("Substring <XYR> founded");
        } else {
            System.out.println("Substring <XYR> isn't founded");
        }

    }
}
