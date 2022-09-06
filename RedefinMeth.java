public class RedefinMeth {
    int i, j;
    RedefinMeth(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j - " + i + " and " + j);
    }
}

class RedefinMeth2 extends RedefinMeth{
    int k;
    RedefinMeth2(int a, int b, int c){
        super(a,b);

        k = c;
    }

    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}

class RedefinitionDemo{
    public static void main(String[] args) {
        RedefinMeth2 ob = new RedefinMeth2(1,2,3);

        ob.show();
    }
}
