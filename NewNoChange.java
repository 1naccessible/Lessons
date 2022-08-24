public class NewNoChange {

    void NewNoChanger(int j, int i) {
        j = -j;
        i = i + j;
    }
}

class NewNoChangeDemo {
    public static void main(String[] args) {
        NewNoChange demo = new NewNoChange();
        int a = 10, b = 20;
        System.out.println("a and b before- " + a + "/" + b);

        demo.NewNoChanger(a, b);
        System.out.println("a and b after- " + a + "/" + b);
    }
}
