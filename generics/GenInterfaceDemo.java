package generics;

public class GenInterfaceDemo<T> implements Containment<T> {
    private T[] arrayRef;

    GenInterfaceDemo(T[] o) {
        arrayRef = o;
    }


    @Override
    public boolean contains(T o) {
        for (T x :
                arrayRef) {
            if (x.equals(o)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] x = {1,2,3};
        GenInterfaceDemo<Integer> integerGenInterfaceDemo = new GenInterfaceDemo<>(x);

        if (integerGenInterfaceDemo.contains(2)){
            System.out.println("integerGenCInterDemo contains 2");
        } else System.out.println("2 doesn't contains in integerGenCInterDemo");

        if (integerGenInterfaceDemo.contains(3)){
            System.out.println("integerGenCInterDemo contains 3");
        } else System.out.println("3 doesn't contains in integerGenCInterDemo");

        if (integerGenInterfaceDemo.contains(5)){
            System.out.println("integerGenCInterDemo contains 5");
        } else System.out.println("5 isn't contained in integerGenCInterDemo");

        //       if (integerGenCInterDemo.contains(9.25)){  - Недопустимо так как обьект типа Integer
        //            System.out.println("integerGenCInterDemo contains 2");
        //        } else System.out.println("2 doesn't contains in integerGenCInterDemo");
    }
}
