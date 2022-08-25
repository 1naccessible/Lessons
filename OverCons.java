public class OverCons {
    int x;
    OverCons(){ //Констрирвоание обьектов способом 1
        System.out.println("Inside OverCons().");
        x = 0;
    }
    OverCons(int i){//Констрирвоание обьектов способом 2
        System.out.println("Inside OverCons(int).");
        x=i;
    }

    OverCons(double d){//Констрирвоание обьектов способом 3
        System.out.println("Inside OverCons(double).");
        x = (int) d;
    }

    OverCons(int i, int j){//Констрирвоание обьектов способом 4
        System.out.println("Inside OverCons(int,int).");
        x = j*i;
    }
}
class OverloadConsDemo{
    public static void main(String[] args) {
        OverCons t1 = new OverCons();
        OverCons t2 = new OverCons(88);
        OverCons t3 = new OverCons(17.25);
        OverCons t4 = new OverCons(2,4);

        System.out.println("t1.x = " + t1.x);
        System.out.println("t1.x = " + t2.x);
        System.out.println("t1.x = " + t3.x);
        System.out.println("t1.x = " + t4.x);
    }
}
