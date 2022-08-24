public class WeightOnMoon {
    public static void main(String[] args) {
        /*
        Сила тяжести на Луне составляет около 17% земной.
         Напишите программу, которая вычислила бы ваш вес на луне
         */
        double MyWeight = 55;
        int MoonGravity = 17;
        int EarthGravity = 100;
        double WeightOnMoon = MyWeight*MoonGravity/EarthGravity;
        if (WeightOnMoon>0) System.out.println("Мой вес на луне будет равняеться = " + WeightOnMoon + " Kg");
    }
}
