public class DOTBREAk {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch, ignore;
        int x = 0;
        do {
            ch = (char) System.in.read();
            System.out.println();
            do {
                ignore = (char) System.in.read();
            }while (ignore !='\n');
            if (ch == ' ' || ignore == ' '){
                x++;
            }

        }while (ch!='.');
        System.out.println(x);
        }
    }

