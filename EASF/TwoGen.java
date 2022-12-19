package EASF;

public class TwoGen<I,S> {
    I iOb;
    S sOb;

    TwoGen(I o1, S o2){
        iOb = o1;
        sOb = o2;
    }

    void ShowTypes(){
        System.out.println("Type I - is " + iOb.getClass().getName());
        System.out.println("Type S - is " + sOb.getClass().getName());
    }

    I getTOb(){
        return iOb;
    }

    S getVOb(){
        return sOb;
    }
}

class DemoTwoGen{
    public static void main(String[] args) {
        TwoGen<Integer, String> genOb = new TwoGen<>(88, "generic");
        genOb.ShowTypes();
        System.out.println(genOb.getVOb());
        System.out.println(genOb.getTOb());
    }
}