package genericStack;

public class StackEmptyException extends Exception{
    StackEmptyException(){
        System.out.println("stack empty, nothing to pop");
    }
}
