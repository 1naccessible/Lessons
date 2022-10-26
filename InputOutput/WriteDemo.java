package InputOutput;

import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        byte b[] = {'a', 'b', 'c'};
        System.out.write(b);
        System.out.write('\n');
    }
}
