package EASF;

public enum TransportCS {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;

    TransportCS(int s){
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
