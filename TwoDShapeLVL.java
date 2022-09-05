//Многоуровневая иерархия
public class TwoDShapeLVL {
    private double width;
    private double height;

    //Конструктор по умолчанию
    TwoDShapeLVL() {
        width = height = 0;
    }

    //Параметризированый конструктор
    TwoDShapeLVL(double w, double h) {
        width = w;
        height = h;
    }

    //Конструктор обьекта с одинаковыми значениями
    //переменных эеземпляра width и height
    TwoDShapeLVL(double x) {
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

    class TriangleLVL extends TwoDShapeLVL {
        private String style;

        TriangleLVL() {
            super(); //вызвать конструктор суперкласса по умолчанию
        }

        TriangleLVL(String s, double w, double h) {
            super(w, h);//вызвать конструктор суперкласса с двумя аргументами
            style = s;
        }

        TriangleLVL(double x) {
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

    class ColorTriangle extends TriangleLVL{
    private String color;
    ColorTriangle(String c, String s, double w, double h){
        super(s,w,h);

        color = c;
    }

    String getColor(){
        return color;
    }

    void setColor(String c){
        color = c;
    }
    void showColor(){
        System.out.println("Color - " + color);
    }
    }
    class ShapesLVL {
        public static void main(String[] args) {
            ColorTriangle t1;
            ColorTriangle t2 = new ColorTriangle("blue","contoured", 8, 12);
            ColorTriangle t3 = new ColorTriangle("red", "shaded-in", 2, 2);

            t1 = t2;

            System.out.println("Information of t1");
            t1.showDim();
            t1.showStyle();
            t1.showColor();
            System.out.println("Area - " + t1.area());

            System.out.println();

            System.out.println("Information of t2");
            t2.showDim();
            t2.showStyle();
            t2.showColor();
            System.out.println("Area - " + t2.area());

            System.out.println();

            System.out.println("Information of t3");
            t3.showDim();
            t3.showStyle();
            t3.showColor();
            System.out.println("Area - " + t3.area());
        }
    }
