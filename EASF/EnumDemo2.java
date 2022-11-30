package EASF;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("константы перечисления Transport:");

        Transport[] allTransports = Transport.values();
        //version 1
        for (Transport t : allTransports) {
            System.out.print(t + "; ");
        }

        System.out.println("\n");
        //version 2
        for (Transport t : Transport.values()) {
            System.out.print(t + "; ");
        }

        System.out.println("\n");

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains - " + tp);
    }
}
