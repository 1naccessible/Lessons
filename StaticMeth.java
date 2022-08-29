public class StaticMeth {
    static int val = 1024;

    static int valdiv2(){
        return  val/2;
    }
}

class SDemo2{
    public static void main(String[] args) {
        System.out.println("Value of val: " + StaticMeth.val);
        System.out.println("StaticMeth.valdiv2: " + StaticMeth.valdiv2());

        StaticMeth.val = 4;

        System.out.println("\nValue of val: " + StaticMeth.val);
        System.out.println("StaticMeth.valdiv2: " + StaticMeth.valdiv2());
    }
}
