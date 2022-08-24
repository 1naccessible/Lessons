public class BreakLable {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni equals " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                    }
                    System.out.println("After block \'three\'");
                }
                System.out.println("After block \'two\'");
            }
            System.out.println("After block \'one\'");
        }
        System.out.println("After cycle \'for\'");
        System.out.println("-------------------------------------------------------------------");
        done:

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("after cycle k");
            }
            System.out.println("after cycle j");
        }
        System.out.println("after cycle i");
        System.out.println("-------------------------------------------------------------------");
        int x = 0, y = 0;
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println(x + " = x and y = " + y);
            }
        }
        System.out.println("-------------------------------------------------------------------");
        int o = 0, p = 0;
        for (o = 0; o < 5; o++)
            stop2:{
                for (p = 0; p < 5; p++) {
                    System.out.println(o + " = o and p = " + p);
                    if(p==2)break stop2;
                }
            }
    }
}