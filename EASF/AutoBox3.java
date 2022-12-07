package EASF;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iob, iob2;
        int i;

        iob = 99;
        System.out.println("origin value iob: " + iob);

        //в данном выражении обьект iob автораспаковывается, производяться вычесления
        //и после результат автоупаковываеься в обьект iob
        iob++;
        System.out.println("after iob++ : " + iob);

        //Выполняется автораспаковка обьекта iob, к полученому значению прибавляется 10,
        //а результат снова автоупаковывается в обьект iob
        iob += 10;
        System.out.println("after iob += 10: " + iob);

        //Выполняеться автораспаковка обьекта iob, происходять вычесления,
        //после которых результат автоупаковывается в обьект iob2
        iob2 = iob + (iob / 3);
        System.out.println("iob2 after solving expression: " + iob2);

        //Выполняеться автораспаковка, вычисления выражения и после
        //без автоупаковки значение присваеваться переменой i
        i = iob + (iob / 3);
        System.out.println("i after solving expression: " + i);

        //При вычислении выражения в операторе обьект iob автораспаковываеться, и последующией обработке
        //подвергаеться значение типа int
        switch (iob){
            case 110: {
                System.out.println("110");
                break;
            }
            case 115: {
                System.out.println("150");
                break;
            }
        }
    }
}
