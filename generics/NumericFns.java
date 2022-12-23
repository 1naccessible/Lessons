package generics;

public class NumericFns<T extends Number> {
    T ob;

    NumericFns(T o) {
        ob = o;
    }

    double reciprocal() {
        return 1 / ob.doubleValue();
    }

    double fraction() {
        return ob.doubleValue() - ob.intValue();
    }

    boolean absEquals(NumericFns<?> ob) {
        if (Math.abs(this.ob.doubleValue()) == Math.abs(ob.ob.doubleValue())){
            return true;
        }
        return false;
    }

}

class BoundsDemo {
    public static void main(String[] args) {

        NumericFns<Integer> intOb = new NumericFns<>(5); //Тип Integer допустим так как являеться подклассом Number

        System.out.println("reciprocal value iob = " + intOb.reciprocal());

        System.out.println("fractional part iob = " + intOb.fraction());

        System.out.println();

        NumericFns<Double> doubleOb = new NumericFns<>(-5.0); ////Тип допустим так как являеться подклассом Number

        NumericFns<Long> longNumericFns = new NumericFns<>(5L);

        System.out.println("reciprocal value doubleOb = " + doubleOb.reciprocal());

        System.out.println("fractional part doubleOb = " + doubleOb.fraction());

        System.out.println(intOb.absEquals(doubleOb));
        System.out.println(doubleOb.absEquals(longNumericFns));


        //NumericFns<String> doubleOb = new NumericFns<>("String"); - не допустимая строка так как используеться
        //ограние типов до классов наследуемых от класса Number, или самого класса Number
    }
}
