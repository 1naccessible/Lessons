package defaultInterfaceDemo;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFmp obj = new MyIFmp();

        System.out.println("User ID - " + obj.getUserID());

        System.out.println("Admin ID - " + obj.getAdminID());
        System.out.println();

        MyIFmp2 obj1 = new MyIFmp2();

        System.out.println("User ID - " + obj1.getUserID());

        System.out.println("Admin ID - " + obj1.getAdminID());
        System.out.println();

        System.out.println("Universal ID (static method) - " + MyIF.getUniversalId());
    }
}
