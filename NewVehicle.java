public class NewVehicle {//создаю класс который инкапсулирует переменные экземпляра
    int passengers; //количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в миллях на галлон

    int range() { //определить максимальную дальность поездки транспорта
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) { //расчитать обьем топлива необходимого
        // транспорту для проезда заданного расстояния
        return (double) miles / mpg;
    }

    NewVehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
}


class SecondVehicle {
    public static void main(String[] args) {
        /**
         * при создании обьекты minivan и sportcar инициализируються конструктором NewVehicle
         * Обьект инициализируется парамертами указанными в конструкторе его класса.
         * например в строке кода как показано ниже
         */
        NewVehicle minivan = new NewVehicle(7,16,21); //полностью сконструировать обьекты транспортных средств
        NewVehicle sportcar = new NewVehicle(2,14,12);
        int dist = 252;

        System.out.println("Minivan can travel with " + minivan.passengers + " passengers" +
                " up to " + minivan.range() + " miles");
        System.out.println("Minivan needs " + minivan.fuelneeded(dist) + "" +
                " gallons of fuel to travel " + dist + " miles\n\n");


        System.out.println("Sportcar can travel with " + sportcar.passengers + " passengers" +
                " up to " + sportcar.range() + " miles");
        System.out.println("Sportcar needs " + sportcar.fuelneeded(dist) + "" +
                " gallons of fuel to travel " + dist + " miles\n\n");

    }
}