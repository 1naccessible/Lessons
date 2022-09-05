public class TwoDShapeSuper2 {
    private double width;
    private double height;

    //Конструктор по умолчанию
    TwoDShapeSuper2() {
        width = height = 0;
    }

    //Параметризированый конструктор
    TwoDShapeSuper2(double w, double h) {
        width = w;
        height = h;
    }

    //Конструктор обьекта с одинаковыми значениями
    //переменных эеземпляра width и height
    TwoDShapeSuper2(double x) {
        width = height = x;
    }

    //методы доступа
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and Height " + width + " and " + height);

    }
}

class TriangleSuper2 extends TwoDShapeSuper2 {
    private String style;

    TriangleSuper2() {
        super(); //вызвать конструктор суперкласса по умолчанию
    }

    TriangleSuper2(String s, double w, double h) {
        super(w, h);//вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }

    TriangleSuper2(double x) {
        super(x);//вызвать конструктор суперкласса с одним аргументом
        style = "shaded-in";
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}

class Shapes5 {
    public static void main(String[] args) {
        TriangleSuper2 t1;
        TriangleSuper2 t2 = new TriangleSuper2("contoured", 8, 12);
        TriangleSuper2 t3 = new TriangleSuper2(4);

        t1 = t2;

        System.out.println("Information of t1");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("Information of t2");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area - " + t2.area());

        System.out.println();

        System.out.println("Information of t3");
        t3.showDim();
        t3.showStyle();
        System.out.println("Area - " + t3.area());
    }
}
