package genericStack;

public class StackFullException extends Exception{
    StackFullException(int n){
        System.out.println("Stack is overflowed, max size = " + n );
    }
}
