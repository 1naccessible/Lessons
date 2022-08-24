public class Search {
    public static void main(String[] args) {
        int srch[] = {1,5,2,9,4,17,23,87,3,2,1};
        int val = 3;
        int y = -1;
      for (int x: srch){
            y++;
            if (x==3){
                System.out.println("значение "+x+" найденно " + "под индексом[" + y + "]");
                break;
            }
        }
    }
}
