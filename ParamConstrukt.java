public class ParamConstrukt {
    int x;
    ParamConstrukt(int i){
        x=i;
    }
}
class DemoParamConstrukt{
    public static void main(String[] args) {
        ParamConstrukt one = new ParamConstrukt(10);
        ParamConstrukt two = new ParamConstrukt(88);
        System.out.println(one.x + " " + two.x);
    }
}
