public class StaticDemo {
    int x; //обычная переменная экземпляра
    static int y; // статическая переменная

    //Вернуть сумму переменной экземпляра х и статической переменной y
    int sum (){
        return x + y;
    }
}

class SDemo{
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //У каждого обьекта имеется своя копия переменной экземпляра
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Разумеется, ob1.x и ob2.x независимы");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        //Все обьекты совместно используют одну общую копию статической переменной
        System.out.println("\nСтатистическая переменная y - общая");
        StaticDemo.y =  19;
        System.out.println("Присвоить StaticDemo.y значение 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());

        StaticDemo.y = 100;
        System.out.println("\nИзменить занчение StaticDemo.y на 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}