package EASF;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;
        tp = Transport.AIRPLANE;
        System.out.println("tp - " + tp);
        System.out.println();
        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN){
            System.out.println("tp = " + tp);
            System.out.println();
        }

        switch (tp){
            case CAR -> System.out.println("car is ride");

            case TRAIN -> {
                System.out.println("ПОЕЗД ЕДЕТ");
                System.out.println("case TRAIN");
            }


        }
    }
}
