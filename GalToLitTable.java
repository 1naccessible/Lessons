public class GalToLitTable {
    public static void main(String[] args) {
        double liters;
        int counter = 0;
        for (double gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " Галонов приравнивается к " + liters + "Литрам");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
