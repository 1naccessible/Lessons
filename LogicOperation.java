public class LogicOperation {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        boolean t = true, f = false;

        if (x < y) System.out.println("x<y");
        if (x <= y) System.out.println("x<=y");
        if (x != y) System.out.println("x!=y");
        if (x == y) System.out.println("x==y");
        if (x > y) System.out.println("x>y");
        if (x >= y) System.out.println("x>=y");

        if (t & f) System.out.println("t & f = false");
        if (!(t & f)) System.out.println("!(t & f) = true");
        if (t | f) System.out.println("t | f = true");
        if (t ^ f) System.out.println("t ^ f true");
    }
    /**
     *
     X=         Y=          X & Y           X | Y           X ^ Y           !X
     false      false       false           false           false           true
     true       false       false           true            true            false
     false      true        false           true            true            true
     true       true        true            true            false           false

     */
}
