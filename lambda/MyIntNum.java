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

    boolean hasCommonFactor(int n){
        for (int i = 2; i <= v || i <=n; i++) {
            if (n % i == 0 && v % i == 0){
                return true;
            }
        }
        return false;
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
            System.out.println("3 Is divider for " + myIntNum1.getV());
        }

        ip = myIntNum2::isFactor;
        result = ip.test(3);
        if (result){
            System.out.printf("3 Is divider for " + myIntNum2.getV());
        }

        ip = myIntNum1::hasCommonFactor;
        result = ip.test(3);
        System.out.println("\n" + result);
    }
}
