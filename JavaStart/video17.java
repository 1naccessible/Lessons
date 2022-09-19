package JavaStart;
//Конкатенация
public class video17 {
    public static void main(String[] args) {

        String stringAnswear;
        int ans  = 42;
        String mass = "Hello World!";
        stringAnswear = mass + " " + ans;
        System.out.println(stringAnswear);

        String num = "-2";
        int oneMoreAns;
        oneMoreAns = Integer.parseInt(num);
        oneMoreAns += ans;
        System.out.println(stringAnswear +" "+ (oneMoreAns));

    }
}
