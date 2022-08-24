public class Guess {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, ignore, answer = 'b';
        System.out.println("Угадайте букву из английского алфавита");
        do {

            ch = (char) System.in.read();
            if (ch == answer) {
                System.out.println("Ура!\nВы угадали букву!");
            }
            else {
                System.out.println("Неверно");
                if (ch < answer) System.out.println("Буква которая вам нужна ближе к концу алфавита\nпопробуйте еще");
                else System.out.println("Буква которая вам нужна ближе к началу алфавита\nпопробуйте еще");

            }
            do {
                ignore = (char) System.in.read();
            }while(ignore!='\n');
        }while(ch!=answer);
    }
}

