public class TwoDShape2 {
    private double width;
    private double height;

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

class Triangle2 extends TwoDShape2 {

    String style;

    double area() {
        return (getHeight() * getWidth()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setWidth(4);
        t1.setHeight(4);
        t1.style = "shaded-in";

        t2.setHeight(8);
        t2.setWidth(12);
        t2.style = " contoured";

        System.out.println(" Information of t1");
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


