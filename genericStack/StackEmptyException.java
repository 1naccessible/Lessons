package genericStack;

public class StackEmptyException extends Exception{
    public StackEmptyException(){
        System.out.println("stack empty, nothing to pop");
    }
}
