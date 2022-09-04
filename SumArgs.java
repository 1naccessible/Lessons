public class SumArgs {
    static int sum(int ...a){
        int summation = 0;
        for (int x: a) {
            summation += x;
        }
        return summation;
    }
}
class SumArgsDemo{
    public static void main(String[] args) {
        System.out.println(SumArgs.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
