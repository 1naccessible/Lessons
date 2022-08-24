public class A_to_a {
    public static void main(String[] args)
            throws java.io.IOException {
        char ignore, high;
        int x = 1;
        do {
            high = (char) System.in.read();

            do {

                ignore = (char) System.in.read();

            } while (ignore != '\n');

            if (high >= 'a' && high <= 'z') {
                high -= 32;
                System.out.print(high);

            } else {
                high += 32;
                System.out.println(high);

            }
            x++;
        } while (high != '.');
        System.out.println("\n" + x + " раз был изменен регистр");
    }
}
