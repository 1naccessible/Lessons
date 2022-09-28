package interfaceDemonstrate;

class byTwosDemo extends byTwos {
    public static void main(String[] args) {
        byTwosDemo ob = new byTwosDemo();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nreset");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }

        System.out.println("\nStart value is 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value - " + ob.getNext());
        }
    }
}
