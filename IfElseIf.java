public class IfElseIf {
    public static void main(String[] args) {
        for(int x =0; x<6;x++){
            if (x==1) System.out.println("x equals - " + x);
            else
                if (x==2) System.out.println("x equals - " + x);
                else
                    if (x==3) System.out.println("x equals - " + x);
                    else
                        if (x==4) System.out.println("x equals - " + x);
                        else System.out.println("ЗНАЧЕНИЕ НЕ ВХОДИТ В ДИАПАЗОН 1-4");
        }
    }
}
