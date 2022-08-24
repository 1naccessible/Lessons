public class AbsVar {
    public static void main(String[] args) {
        int var = -1;
        int absvar;

        // example of operator ?
        absvar = var<0 ? -var : var;
        System.out.println(absvar);
        //example of operator if-else
        if (var < 0) absvar = -var;
        else absvar = var;
        System.out.println(absvar);

    }
}
