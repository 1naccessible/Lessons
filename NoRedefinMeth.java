public class NoRedefinMeth {
    int i, j;

    NoRedefinMeth(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j - " + i + " and " + j);
    }

}
class NoRedefinMeth2 extends NoRedefinMeth{
    int k;

    NoRedefinMeth2(int a, int b, int c){
        super(a,b);

        k = c;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}
class OverloadMeth{
    public static void main(String[] args) {
        NoRedefinMeth2 ob = new NoRedefinMeth2(1,2,3);

        ob.show("k: ");//вызывается метод show() из класса NoRedefinMeth2
        ob.show();//вызывается метод show() из класса NoRedefinMeth
    }
}
