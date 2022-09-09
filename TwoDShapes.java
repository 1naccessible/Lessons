abstract class TwoDShapes {
    private double width;
    private double height;

    private double diam;
    private String name;

    final double PI = 3.14;

    //Конструктор по умолчанию
    TwoDShapes() {
        width = height = 0;
        name = "none";
    }


    //Параметризированный конструктор
    TwoDShapes(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Создать обьект с одинаковыми значениями переменных экземпляра width и height
    TwoDShapes(double x, String n) {
        width = height = diam = x;
        name = n;
    }

    //Создать обьект на основе другого
    TwoDShapes(TwoDShapes ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Методы доступа
    double getWidth() {
        return width;
    }

    double getDiam(){
        return diam;
    }

    double getRad(){
        return (getDiam()/2);
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

    void setDiam(double d){
        diam = d;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("width and height: " + width + " and " + height);
    }

    abstract double area();
}

//Подкласс для представления треугольника
//Производный от класса TwoDShapes
class Triangles extends TwoDShapes {
    private String style;

    //Конструктор по умолчанию
    Triangles() {
        super();
        style = "none";
    }

    //Конструктор класса Triangles
    Triangles(String s, double w, double h) {
        super(w, h, "Triangle");
        style = s;
    }

    //Конструктор с одним аргументом для построения треугольника
    Triangles(double x) {
        super(x, "Triangle");
        style = "shaded-in";
    }

    //Создать один обьект на основе другого
    Triangles(Triangles ob) {
        super(ob); // Передать обьект конструктору класса TwoDShapes

        style = ob.style;
    }

    //Переопределение метода area() для класса Triangles
    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle" + style);
    }
}

//Подкласс для представления прямоугольников, производный от класса TwoDShapes
class Rectangles extends TwoDShapes {

    //Конструктор по умолчанию
    Rectangles() {
        super();
    }

    //Конструктор класса Rectangles
    Rectangles(double w, double h) {
        super(w, h, "Rectangle");//Вызвать конструктор суперкласса
    }

    //Создать квадрат
    Rectangles(double x) {
        super(x, "Rectangle");//Вызвать конструктор суперкласса
    }

    //Создать один обьект на основе другого
    Rectangles(Rectangles ob) {
        super(ob);//передать обьект конструктору TwoDShapes
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        else return false;
    }

    //Переопределение метода area() для класса Rectangles
    double area() {
        return getWidth() * getHeight();
    }
}

class Circle extends TwoDShapes {
    Circle(int w, String n) {
        super(w, n);
    }

    @Override
    double area() {
        return (getRad()*getRad()) * PI;
    }
}

class DynShapes {
    public static void main(String[] args) {
        TwoDShapes shapes[] = new TwoDShapes[5];

        shapes[0] = new Triangles("contoured", 8, 12);
        shapes[1] = new Rectangles(10);
        shapes[2] = new Rectangles(10, 4);
        shapes[3] = new Triangles(7);
        shapes[4] = new Circle(5,"Circle");


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object - " + shapes[i].getName());
            System.out.println("Area - " + shapes[i].area());
            System.out.println();
        }
    }
}
