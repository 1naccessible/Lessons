public class Recursion6 {
    static String line = "RECURSION IS EASY";

    static {
        System.out.println(line);
    }

    static void meth(int a, int b){
        if (a != -1){
            System.out.print(line.substring(a,b));
            Recursion6.meth(a-1,b-1);

        }

    }

}
class RecursDemo{
    public static void main(String[] args) {
        Recursion6.meth(Recursion6.line.length()-1,Recursion6.line.length()+1-1);
    }
}




