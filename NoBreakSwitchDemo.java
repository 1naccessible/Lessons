public class NoBreakSwitchDemo {
    public static void main(String[] args) {
        int i;
        {
            for (i = 0; i < 6; i++)
                switch (i) {
                    case 0:
                        System.out.println("case 0 ,i equals \n" + i);

                    case 1:
                        System.out.println("case 1 ,i equals \n" + i);

                    case 2:
                        System.out.println("case 2 ,i equals \n" + i);

                    case 3:
                        System.out.println("case 3 ,i equals \n" + i);

                    case 4:
                        System.out.println("case 4 ,i equals \n" + i);
                }

        }
        {
            System.out.println("\n\n\n\n\n");
            for (int x = 1; x <=4; x++)
                switch (x) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("i равно 1, 2 или З");
                        break;
                    case 4:
                        System.out.println("i равно 4");
                        break;
                }
        }
    }
}

