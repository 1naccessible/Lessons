public class DWDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); // получить символ с клавиатуры
            do {

                ignore = (char) System.in.read();
            } while(ignore!='\n');
        } while (ch != 'q');

    }
}