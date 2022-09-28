public class Vehicle implements IVehicle { //создаю класс который инкапсулирует переменные экземпляра
    int passengers; //количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в миллях на галлон

    public int range() { //определить максимальную дальность поездки транспорта
        return mpg * fuelcap;
    }

    @Override
    public double fuelneeded(int miles) { //расчитать обьем топлива необходимого
        // транспорту для проезда заданного расстояния
        return (double) miles / mpg;


    }

}


class twoVehicle {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(); // создаю обьект минивен который
        // хранит в себе копию всех переменных экземпляра

        Vehicle sportcar = new Vehicle(); // создаю обьект спорткар который
        // хранит в себе копию всех переменных экземпляра

        int range1, range2, dist = 252;


        minivan.passengers = 7; //задаю значение копии переменной обьекта minivan
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2; //задаю значение копии переменной обьекта sportcar
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        double gallons1 = minivan.fuelneeded(dist);
        double gallons2 = sportcar.fuelneeded(dist);
        range1 = minivan.range();
        range2 = sportcar.range();
        /**
         * This program can be easier without variable range 1 and range 2
         * because the method range call can be specified in method println()
         * it will look like this:
         * Sout("Minivan can travel with " + minivan.passengers + " passengers" +
         *                 " up to " + minivan.range() + " miles");
         */

        System.out.println("Minivan can travel with " + minivan.passengers + " passengers" +
                " up to " + range1 + " miles");
        System.out.println("Minivan needs " + gallons1 + " gallons of fuel to travel " + dist + " miles\n\n");


        System.out.println("Sportcar can travel with " + sportcar.passengers +
                " passengers" + " up to " + range2 + " miles");
        System.out.println("Sportcar needs " + gallons2 + " gallons of fuel to travel " + dist + " miles");

    }
}

