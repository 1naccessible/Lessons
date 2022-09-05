// Класс описывающий двумерные обьекты
public class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("width and height - " + width + " and " + height);
    }
}


// Подкласс для представления треугольников наследуюмый от класса TwoDShape
class Triangle extends TwoDShape { //Класс Triangle наследует TwoDShape
    String style;

    double area() {
        return (width * height) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) {
            return true;
        } else return false;
    }

    double area() {
        return width * height;
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        //Обьектам подклассов достпны все члены наследуемого класса
        t1.width = 4;
        t1.height = 4;
        t1.style = "shaded-in";

        t2.width = 8;
        t2.height = 12;
        t2.style = "contoured";

        System.out.println("Information of t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("Information of t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}
