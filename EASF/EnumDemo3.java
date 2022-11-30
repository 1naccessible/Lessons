package EASF;

public class EnumDemo3 {
    public static void main(String[] args) {

        System.out.println("typical speed of Airplane: " + TransportCS.AIRPLANE.getSpeed() + " mile/h");

        System.out.println();

        System.out.println("typical speed of vehicles");
        for (TransportCS t: TransportCS.values()){
            System.out.println(t + ": " + t.getSpeed() + " mile/h");
        }
    }
}
