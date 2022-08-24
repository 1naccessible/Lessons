public class TaskNo2_1 {
    /*
     В данном проекте предстоит написать программу, вычисляющую расстояние
в футах до источника звука, возникающего при вспышке молнии.
Звук распространяется в воздухе со скоростью, приблизительно равной 1100 фут/с.
Следовательно, зная промежуток времени между теми моментами, когда наблюдатель
увидит вспышку молнии и услышит сопровождающий ее раскат грома, можно рассчитать расстояние до нее.
Допустим, что этот промежуток времени составляет 7 ,2 секунды.

Усложним задачу. Рассчитать расстояние до крупного объекта, например скалы,
можно по времени прихода эхо. Так, если вы хлопнете в ладоши, время, через
которое вернется эхо, будет равно времени прохождения звука в прямом и обратном направлении.
Разделив этот промежуток времени на два, вы получите время
прохождения звука от вас до объекта. Полученное значение можно затем использовать для расчета расстояния до объекта.
Видоизмените рассмотренную выше
программу, используя в расчетах промежуток времени до прихода эха.
     */

    public static void main(String[] args) {
        int speed = 1100;
        double time = 7.2;
        double distance = speed * time;
            System.out.println();

            System.out.println("Дистанция которую пройдет звук до очевидца молнии - " + distance + " Футов ");
                System.out.println();

        {
            double timeToObject = time/2;
            double distanceToObject = timeToObject * speed;
            double timeToObjectAndBack = timeToObject * 2;
            double distanceToObjectAndBack = timeToObjectAndBack * speed;
            System.out.println("Time to object = " + timeToObject);
                System.out.println();

            System.out.println("Time to object and back = " + timeToObjectAndBack);
                System.out.println();

            System.out.println("distance to object = " + distanceToObject);
                System.out.println();

            System.out.println("distance to object and back = " + distanceToObjectAndBack);


        }
    }
}

