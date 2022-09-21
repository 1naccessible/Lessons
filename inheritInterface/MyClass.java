package inheritInterface;

public class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Realization of method - meth1");
    }
    public void meth2() {
        System.out.println("Realization of method - meth2");
    }
    public void meth3() {
        System.out.println("Realization of method - meth3");
    }
}
