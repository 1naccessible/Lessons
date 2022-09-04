public class Swap {
    int a;
    Swap(int i){
        a = i;
    }

    void swap(Swap ob2){
        int swaped;
        swaped = ob2.a;
        ob2.a = a;
        a = swaped;
        System.out.println("ob2.a = " + ob2.a);
    }
}
class SwapDemo{
    public static void main(String[] args) {
        Swap ob1 = new Swap(10);

    ob1.swap(new Swap(12));
        System.out.println("ob1.a = " + ob1.a);
    }
}
