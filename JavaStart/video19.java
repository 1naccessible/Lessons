package JavaStart;

public class video19 {
    public static void main(String[] args) {
        boolean eveNum;
        int i = 3;

        for (int x = 0; x<2; x++){
            --i;
            if (i%2 == 0) {
                eveNum = true;
            }else eveNum = false;
            System.out.println(eveNum + "\n");
            int f = 7;
            int g = 2;
            int p = f/g;
            System.out.println(p);
        }
    }
}
