package lambda;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

interface MyIOActionInterface{
    boolean myIOAction(Reader rdr) throws IOException;
}
public class MyIOAction {
    public static void main(String[] args) {
            MyIOActionInterface reader = rdr -> {
                int ch = rdr.read();
                System.out.println(ch);
                return true;
            };

        try {
            Reader reader1 = new InputStreamReader(System.in);
            System.out.println(reader.myIOAction(reader1));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
