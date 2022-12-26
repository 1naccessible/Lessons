package genericStack;

interface Interface <T> {
    void push (T ob) throws StackFullException;
    T pop () throws StackEmptyException;
}
