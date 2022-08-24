public class ForTest {
    public static void main(String[] args)
    throws java.io.IOException{
        System.out.println("for end cycle press S");
        char ignore;
        for (int x = 0;(char) System.in.read() != 's';x++ ){
            System.out.println("Проход #" + x);
           do {
               ignore = (char) System.in.read();
           }while (ignore!='\t' && ignore!='\n');
        }
    }
}
