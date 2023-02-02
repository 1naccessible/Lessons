package lambda;

interface MyFunc{
    MyClass func(String s);
}

interface MyFunc2 {
    MyClass func();
}

class MyClass{
    private final String s;

    MyClass(String s){
        this.s = s;
    }

    MyClass(){
        this.s = "default constructor";
    }
    String getStr(){
        return s;
    }
}
public class ConsRefDemo {
    public static void main(String[] args) {
        MyFunc myFunc = MyClass::new;
        MyClass mc = myFunc.func("test");
        System.out.println(mc.getStr());
        MyFunc2 myFunc2 = MyClass::new;
        mc = myFunc2.func();
        System.out.printf(mc.getStr());
    }
}
