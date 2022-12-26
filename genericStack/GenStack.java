package genericStack;

public class GenStack {
    public static void main(String[] args) {
        Integer[] buff = new Integer[10];
        StackRealization<Integer> iOb = new StackRealization<>(buff);
        try {
            for (int i = 0; i <= 10; i++) {
                iOb.push(i);
            }
        } catch (StackFullException e) {
            System.out.println();

        }

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Pop from stack int value " + iOb.pop());
            } catch (StackEmptyException e) {
                System.out.println();
            }
        }
        Character[] charsBuff = new Character[10];
        StackRealization<Character> chOb = new StackRealization<>(charsBuff);

        String str = "SomeSevenS";
        char[] buf = str.toCharArray();
        try {
            for (int i = 0; i <= buf.length; i++) {
                chOb.push(buf[i]);
            }
        } catch (StackFullException e) {
            System.out.println();
        }

        try {
            for (int i = 0; i <= buf.length; i++) {
                System.out.println("Pop from stack chars - " + chOb.pop());
            }
        } catch (StackEmptyException e) {
            System.out.println();
        }
    }
}
