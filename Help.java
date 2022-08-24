public class Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("оператор if: \nif(условие) оператор\nelse оператор\n");
                break;
            case '2':
                System.out.println("оператор switch: \nswitch(выражение либо переменная) {" +
                        "\ncase константа: " +
                        "\n\tпоследовательность операторов\n\tbreak;\n\t//..." +
                        "\n\tdefault последовательность операторов(по желанию)" +
                        "\n\t}\n");
                break;
            case '3':
                System.out.println("Оператор for:\n" +
                        "for(инициализация;условие;итерация)\n" +
                        "оператор;\tили\t{операторы}\n");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n" +
                        "while(ycлoвиe)\n" +
                        "оператор;\tили\t{операторы}\n");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n" +
                        "do{\n" +
                        "операторы\n" +
                        "}while(условие);\n");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n" +
                        "break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n" +
                        "continue; или continue метка;");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.println("0. Справка \n" +
                "1. Оператор if \n" +
                "2. Оператор switch\n" +
                "3. Оператор for\n" +
                "4. Оператор while\n" +
                "5. Оператор do-while\n" +
                "6. Оператор break\n" +
                "7. Оператор continue\n" +
                "Choise number\n\n" +
                "нажите q для того что бы выйти\n");

    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' | ch == 'q') return false;
        else return true;
    }
}

class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choise, ignore;
        Help help = new Help();
        help.showmenu();
        for (; ; ) {
            do {


                choise = (char) System.in.read();


                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                help.helpon(choise);

            } while (help.isvalid(choise));
            if ((choise) == '0') {
                help.showmenu();
            }

            if (choise == 'q') break;

            System.out.println("\n");

        }
    }
}
