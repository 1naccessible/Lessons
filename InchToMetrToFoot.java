public class InchToMetrToFoot {
    public static void main(String[] args) {
        double inch = 39.37;
        double metr1 = 1;
        double metr2;
        double foot = 30.48;
        double MetrInFoot;
        int JAdaun = 0;

        for (metr1 = 1; metr1 <= 120; metr1++) {
            metr2 = metr1 * inch;
            System.out.println(metr1 + " Метров приравнивается к " + metr2 + " Дюймам");
            JAdaun++;

            if (JAdaun == 12) {

                MetrInFoot = metr1 * foot;
                System.out.println();
                System.out.println(metr1 + " Метров в " + MetrInFoot + " Футах");
                System.out.println();
                JAdaun = 0;
            }
        }
    }
}
