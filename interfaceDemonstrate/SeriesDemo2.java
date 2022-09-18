package interfaceDemonstrate;

public class SeriesDemo2 {
    public static void main(String[] args) {
        byTwos byTwosOb = new byTwos();
        byThrees byThreesOb = new byThrees();
        Series ob;

        for (int i = 0; i < 5; i++){
            ob = byTwosOb;
            System.out.println("Next value of byTwos - " + ob.getNext());

            ob = byThreesOb;
            System.out.println("Next value of byThrees - " + ob.getNext());
        }
    }
}

