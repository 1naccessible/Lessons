public class Construkt {
    int x;

    Construkt() {
        x = 10;
    }
}

class DemoCostrukt {
    public static void main(String[] args) {
        Construkt t1 = new Construkt();
        Construkt t2 = new Construkt();
        System.out.println(t1.x + " " + t2.x);
    }
}