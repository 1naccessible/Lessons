public class TwoDShapeOB {
    private double width;
    private double height;

    TwoDShapeOB() {
        width = height = 0;
    }

    TwoDShapeOB(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShapeOB(double x) {
        width = height = x;
    }

    TwoDShapeOB(TwoDShapeOB ob) {
        width = ob.width;
        height = ob.height;
    }

    void showDim() {
        System.out.println("Width and Height - " + width + " and " + height);
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(int w) {
        width = w;
    }

    void setHeight(int h) {
        height = h;
    }
}

class TriangleOB extends TwoDShapeOB {
    private String style;

    TriangleOB() {
        super();
        style = "none";
    }

    TriangleOB(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    TriangleOB(double x) {
        super(x);
        style = "shaded-in";
    }

    TriangleOB(TriangleOB ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle(){
        System.out.println("Triangle - " + style);
    }

}

class Shapes7{
    public static void main(String[] args) {
        TriangleOB t1 = new TriangleOB("contoured", 8, 12);

        //Создать копию обьекта t1
        TriangleOB t2 = new TriangleOB(t1);

        System.out.println("Information of t1");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("Information of t2");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area - " + t2.area());

    }
}
