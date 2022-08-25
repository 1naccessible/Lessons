public class CallBeReff {
    int a, b;
    CallBeReff(int a, int b){
    this.a = a;
    this.b = b;
    }

    void change(CallBeReff ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
class CallBeReffDemo{
    public static void main(String[] args) {
        CallBeReff ob = new CallBeReff(15,20);

        System.out.println("ob.a and ob.b before call: " + ob.a +"/" + ob.b);

        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + "/" + ob.b);
    }
}
