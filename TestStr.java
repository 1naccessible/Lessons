public class TestStr {
    public static void main(String[] args) {
        String arrstring[] = {"where","why","who","seldom","one","two","three","four","five","ten"};
        String ttt = new String();
        for (String x: arrstring){
            System.out.print(x + "/");
        }
        for (int a = 1;a< arrstring.length; a++){
            for (int b = arrstring.length-1;b>=a;b--){
                int x = arrstring[b-1].compareTo(arrstring[b]);
                int y = arrstring[b].compareTo(arrstring[b-1]);
                if (x < y) {
                    ttt =  arrstring[b-1];
                    arrstring[b-1] = arrstring[b];
                    arrstring[b] = ttt;
                }
            }
        }
        System.out.println("\n");
        for (int x=0;x<arrstring.length;x++){
            System.out.print(arrstring[x] + "/");
        }
    }
}
