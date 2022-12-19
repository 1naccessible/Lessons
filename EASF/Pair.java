package EASF;

public class Pair <T, V extends T>{
    T first;
    V second;

    Pair(T obT, V obV){
        first = obT;
        second = obV;
    }
}
class PairDemo{
    public static void main(String[] args) {
        // Эта строка кода верна, поскольку Т и V имеют тип Integer
        Pair<Integer, Integer> integerIntegerPair = new Pair<Integer, Integer>(1, 2);

        // И эта строка кода верна, так как Integer - подкласс Number
        Pair<Number, Integer> numberIntegerPair = new Pair<Number, Integer>(10.4, 12);

        // Эта строка кода недопустима, так как String не является
        // подклассом Number
        //Pair<Number, String> z = new Pair<Number, String>(10.4, "12");
    }
}
