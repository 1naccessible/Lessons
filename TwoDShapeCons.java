public class TwoDShapeCons {
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

class Triangle3 extends TwoDShapeCons {

    private String style;

    //Constructor
    Triangle3(String s, double w, double h) {
        setHeight(h);
        setWidth(w);
        style = s;
    }

    double area() {
        return (getHeight() * getWidth()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }

}

class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("shaded-in", 4, 4);
        Triangle3 t2 = new Triangle3("contoured", 8, 12);


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

