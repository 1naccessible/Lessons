package generics;

class A {
}

class B extends A {
}

class C extends B {
}

class D {
}

public class UseBoundedWildcard {
    static void test(Gen<? extends A> ob) {
        System.out.println("method works " + ob.getOb().getClass().getName());
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> aOb = new Gen<>(a);
        Gen<B> bOb = new Gen<>(b);
        Gen<C> cOb = new Gen<>(c);
        Gen<D> dOb = new Gen<>(d);

        test(aOb);
        test(bOb);
        test(cOb);
//      test(dOb); это не будет работать так как класс D не являеться наследником класса А

    }
}

