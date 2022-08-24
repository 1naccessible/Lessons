public class SqrtRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for (num = 1; num<=100;num++){
            sroot =  Math.sqrt(num);
           System.out.println("Корень квадратный из числа " + num +" equals = " + sroot );
           rerr =num - sroot*sroot;
            System.out.println("Ошибка окургления: " + rerr + "\n");
        }
    }
}
