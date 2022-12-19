package EASF;

public class NumericFns<T extends Number> {
    T ob;

    NumericFns(T o){
        ob = o;
    }

    double reciprocal(){
        return 1/ob.doubleValue();
    }

    double fraction(){
        return ob.doubleValue() - ob.intValue();
    }

}

class BoundsDemo {
    public static void main(String[] args) {

        NumericFns<Integer> intOb = new NumericFns<>(5); //Тип Integer допустим так как являеться подклассом Number

        System.out.println("reciprocal value iob = " + intOb.reciprocal());

        System.out.println("fractional part iob = " + intOb.fraction());

        System.out.println();

        NumericFns<Double> doubleOb = new NumericFns<>(5.25); ////Тип допустим так как являеться подклассом Number

        System.out.println("reciprocal value doubleOb = " + doubleOb.reciprocal());

        System.out.println("fractional part doubleOb = " + doubleOb.fraction());

        //NumericFns<String> doubleOb = new NumericFns<>("String"); - не допустимая строка так как используеться
        //ограние типов до классов наследуемых от класса Number, или самого класса Number
    }
}