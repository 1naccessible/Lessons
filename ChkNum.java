public class ChkNum {
    boolean isEven(int x) { //x - целочисленный параметр метода
        if ((x % 2) == 0) return true;
        else return false;
    }
}
class ParmDemo{
    public static void main(String[] args) {
        ChkNum i = new ChkNum();

        if (i.isEven(10)) System.out.println("10 - четное число");//передаю аргумент (10) методу
        if (i.isEven(9)) System.out.println("9 - четное число");
        if (i.isEven(8)) System.out.println("8 - четное число");
    }
}
