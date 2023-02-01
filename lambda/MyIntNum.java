package lambda;

import java.util.function.IntPredicate;

public class MyIntNum {
    private final int v;
    MyIntNum(int n){
        v = n;
    }

    int getV(){
        return v;
    }

    boolean isFactor (int n){
        return (v%n) == 0;
    }
}

class InstanceMethodRefDemo{
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum1 = new MyIntNum(16);
        MyIntNum myIntNum2 = new MyIntNum(12);

        IntPredicate ip = myIntNum1::isFactor;

        result = ip.test(3);
        if(result){
            System.out.printf("3 Is divider for " + myIntNum1.getV());
        }

        ip = myIntNum2::isFactor;
        result = ip.test(3);
        if (result){
            System.out.printf("3 Is divider for " + myIntNum2.getV());
        }
    }
}
