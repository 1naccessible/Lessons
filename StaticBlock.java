public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static double rootOf4;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);
        rootOf4 = Math.sqrt(4);
        System.out.println("Корень из 4 равен = " + StaticBlock.rootOf2);
    }

    StaticBlock(String msg){
        System.out.println(msg); //Выполнение конструктора начинаеться сразу после получения им аргумента
    }
}

class StaticBlockDemo{
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен = " + StaticBlock.rootOf2);
        System.out.println("\nКорень квадратный из 3 равен = " + StaticBlock.rootOf3);

    }
}
