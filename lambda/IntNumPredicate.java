package lambda;

public interface IntNumPredicate {
    boolean test(MyIntNum ob, int n);
}

class InstanceMethodRefDemo2{
    public static void main(String[] args) {
        boolean result;
         MyIntNum myIntNum1 = new MyIntNum(12);
         MyIntNum myIntNum2 = new MyIntNum(16);

         IntNumPredicate intNumPredicate = MyIntNum::isFactor;

         result = intNumPredicate.test(myIntNum1, 3);
         if (result){
             System.out.println("3 is divider for " + myIntNum1.getV());
         }

         result = intNumPredicate.test(myIntNum2,3);
         if (result){
             System.out.println("3 isn't divider for " + myIntNum2.getV());
         }

    }
}