public class ABConstr {
    ABConstr(){
        System.out.println("Constructor A");
    }
}
class B extends ABConstr{
    B(){
        super();
        System.out.println("Constructor B");
    }
}

class C extends B{
    C(){
        super();
        System.out.println("Constructor C");
    }
}

class ABConstrDemo{
    public static void main(String[] args) {
        C ob = new C();

    }
}
