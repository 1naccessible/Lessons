class CantPushSymbolInStackException extends Exception{
    @Override
    public String toString() {
        return "Невозможно добавить символ в стек. Стек переполнен!";
    }
}
class CantGetSymbolFromStackException extends Exception{
    @Override
    public String toString() {
        return "Невозможно достать символ из стека. Стек пуст!";
    }
}
public class Stack {
    private char sym[];
    private int putloc, getloc;

    Stack(int size) {
        sym = new char[size];
        putloc = 0;
        getloc = size;
    }

    void push(char symbol) throws CantPushSymbolInStackException{
        if (putloc == sym.length - 1) {
            throw new CantPushSymbolInStackException();
        }
        putloc++;
        sym[putloc] = symbol;
        System.out.print("\n" + sym[putloc]);
    }

    char pop() throws CantGetSymbolFromStackException {
        if (getloc == 1) {
            throw new CantGetSymbolFromStackException();
        }
        getloc--;
        return sym[getloc];
    }
}

class StackDemo {
    public static void main(String[] args) {
        Stack demonstrator = new Stack(10);
        char line = 'a' - 1;
        int symbols = 0;
        System.out.println("in stack inputed symbols:");
        for (int i = 0; i < 10; i++) {
            line++;
            try {
                demonstrator.push(line);
            }catch (CantPushSymbolInStackException e){
                System.out.println(e);
            }
            symbols++;
        }
        System.out.println();
        System.out.println("from stack gated symbols:");
        for (int i = 0; i <= symbols - 1; i++)
            try {
                System.out.println(demonstrator.pop());
            }catch (CantGetSymbolFromStackException e){
                System.out.println(e);
            }
    }
}