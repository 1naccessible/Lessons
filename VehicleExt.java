public class VehicleExt {
    private int passengers;
    private int fuelCap;
    private int mpg;

    VehicleExt(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    int range() {
        return fuelCap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles * mpg;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    void setFuelCap(int f) {
        fuelCap = f;
    }

    void setMpg(int m) {
        mpg = m;
    }

    int getPassengers() {
        return mpg;
    }

    int getFuelCap() {
        return fuelCap;
    }

    int getMpg() {
        return mpg;
    }
}

class Truck extends VehicleExt {
    private int carGoCap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);

        carGoCap = c;
    }

    int getCarGoCap() {
        return carGoCap;
    }

    void setCarGoCap(int c) {
        carGoCap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Грузовик может перевести " + semi.getCarGoCap() + " футов");
        System.out.println("Для преодоления " + dist + "миль грузовику требуеться " + gallons + "галонов топлива");

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Пикап может перевезти" + pickup.getCarGoCap() + " фунтов");
        System.out.println("Для преодоления " + dist + " миль пикапу треуеться " + gallons + " галлонов топлива");
    }
}
