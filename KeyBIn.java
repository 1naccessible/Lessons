public class KeyBIn {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int x;
        System.out.println("НАЖМИТЕ ЛЮБУЮ КЛАВИШУ");

        ch = (char) System.in.read();

        System.out.println("ВЫ нажали клавишу - " + ch);
    }
}

