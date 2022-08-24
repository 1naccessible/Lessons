public class Scops2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("initial value of i equals " + i);
        if (false & (++i<100)) System.out.println("gggg");
        System.out.println(i + " incrementation of variable has been executed");
         if (false && (++i<100)) System.out.println("gggg");
        System.out.println(i + " \'i\' still increased ");
    }
}
