package genericStack;

public class StackRealization<T> implements Interface<T>{
    private T buff[];
    private int startPoint = 0;
    private int overflow;

    StackRealization(T[] buff){
        this.buff = buff;
        overflow = buff.length;
    }

    @Override
    public void push(T ob) throws StackFullException{
            if (startPoint == overflow - 1) {
                buff[overflow - 1] = ob;
                System.out.println("Push in stack " + ob.getClass().getSimpleName() + " value " + ob);
                throw new StackFullException(overflow);
            }else {
                System.out.println("Push in stack " + ob.getClass().getSimpleName() + " value " + ob);
                buff[startPoint++] = ob;
            }
        }

    @Override
    public T pop() throws StackEmptyException{
            if (startPoint < 0){
               throw new StackEmptyException();
            }else {
                return buff[startPoint--];
            }
        }
    }

