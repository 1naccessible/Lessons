public class Stack {
    private char sym[];
    private int putloc, getloc;

    Stack(int size) {
        sym = new char[size];
        putloc = 0;
        getloc = size;
    }

    void push(char symbol) {
        if (putloc == sym.length - 1) {
            System.out.println("\nStack is full");
            return;
        }
        putloc++;
        sym[putloc] = symbol;
        System.out.print("\n" + sym[putloc]);
    }

    char pop() {
        if (getloc == 1) {
            System.out.println("\nStack is empty");
            return ' ';
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
            demonstrator.push(line);
            symbols++;
        }
        System.out.println();
        System.out.println("from stack gated symbols:");
        for (int i = 0; i <= symbols - 1; i++)
            System.out.println(demonstrator.pop());

    }
}