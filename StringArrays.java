public class StringArrays {
    public static void main(String[] args) {
        String arr[] = {"this","line","is","test"};
        int y = -1;

        for(String x: arr){
           y++;
            System.out.println("index[" + y + "] of string equals    " + x);
        }

        arr[2]= "is just";
        arr[3]= "a test";
        System.out.println("changed array:");
        y = -1;
        for (String x: arr){
            y++;
            System.out.println("index[" + y + "] of string equals    " + x);
        }
    }
}
