public class Sup {
    void meth(){
        System.out.println("meth() in Sup");
    }
}
class Sub1 extends Sup{
    void meth(){
        System.out.println("meth() in Sub1");
    }
}

class Sub2 extends Sub1{
    void meth(){
        System.out.println("meth() in Sub2");
    }
}

class DynDispDemo{
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 sub1Ob = new Sub1();
        Sub2 sub2Ob = new Sub2();

        Sup superRef;

        superRef = superOb;
        superRef.meth();



        superRef = sub2Ob;// Ссылочной переменной суперкласса присваиваеться ссылка на обьект подкласса
        superRef.meth();// И в результате вызова переопределенного метода, вызываеться версия метода
                        // которая переопределенна в подклассе на который ссылается
                        // ссылочна переменная.



        superRef = sub1Ob;
        superRef.meth();
    }
}