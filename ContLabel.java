public class ContLabel {
    public static void main(String[] args) {
        OuterCycle:
        for (int i = 1; i<10; i++){
            System.out.print("\nПроход внешнего цикла номер - " + i +
                    "\t внутрений цикл: ");
            for (int j = 1; j<10;j++){
                if (j == 6)continue OuterCycle;
                System.out.print("\t" + j);
            }
        }
    }
}
