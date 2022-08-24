public class NoZeroDiv {
    public static void main(String[] args) {
        int result1 = 0;

        for (int i = -5; i < 6; i++) {
            result1 = i != 0 ? 100 / i : 0; //0 выведится в ответ
            System.out.println("100/ " + i + " equals \t" + result1);
        }

        System.out.println("\n\n\n");
        boolean boo;
        for (int i = -5; i < 6; i++){
            boo = i!=0? true : false; //0 не выведется в ответ
            if (boo) System.out.println("100/ " + i + " equals \t" + 100/i);
        }

    }
}
