package EASF;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp1;
        Transport tp2;
        Transport tp3;

        System.out.println("Константы перечисления Transport и их порядковые значения");

        for (Transport t: Transport.values()){
            System.out.println("Порядковое значение у - " + t + " = " + t.ordinal());
        }

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.CAR;
        tp3 = Transport.BOAT;

        if (tp1.compareTo(tp3) < 0) {
            System.out.println(tp1 + " идет перед " + tp3);
        }else if (tp1.compareTo(tp3) > 0) {
            System.out.println(tp1 + " идет после " + tp3);
        }

    }
}
