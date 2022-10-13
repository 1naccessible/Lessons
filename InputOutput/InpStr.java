package InputOutput;

public class InpStr {
    public static void main(String[] args) {
        String location = InpStr.class.getProtectionDomain().getCodeSource().getLocation().getFile();
    }
}
