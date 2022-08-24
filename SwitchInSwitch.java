public class SwitchInSwitch {
    public static void main(String[] args) {
        char ch = 'a', ch1 = 'b';
        switch (ch) {
            case 'a':
                System.out.println("Раздел \"a\" внешнего оператора\n\n");
                switch (ch1){
                    case 'b':
                        System.out.println("Раздел \"b\" внутреннего оператора");
                        System.out.println("Switch in Switch");
                }

        }
    }
}
