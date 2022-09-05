public class TwoDShapeSuper {
    private double width;
    private double height;

    //Параметризированный конструктор суперкласса
    TwoDShapeSuper(double w, double h) {
        width = w;
        height = h;
    }

    // Методы доступа
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
        System.out.println("Width and Height = " + width + " and " + height);
    }
}

class TriangleSuper extends TwoDShapeSuper {
    private String style;

    TriangleSuper(String s, double w, double h) {
        super(w, h); // Вызов конструктора суперкласса
        style = s;
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}

class Shapes4 {
    public static void main(String[] args) {
        TriangleSuper t1 = new TriangleSuper("shaded-in", 4, 4);
        TriangleSuper t2 = new TriangleSuper("contoured", 12, 8);

        System.out.println("Information of t1");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("information of t2");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area - " + t2.area());

    }
}
