public class ASup {
    int i;
}
class BSup extends ASup{
    int i;

    BSup(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i суперкласса = " + super.i);
        System.out.println("i подкласса = " + i);
    }
}
class UseSuper{
    public static void main(String[] args) {
        BSup ob = new BSup(11,3);

        ob.show();
    }
}
