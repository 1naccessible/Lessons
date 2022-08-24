public class Chapter5TASKS {
}
/**
 * 1)
 *                  1. double[] arr = new double [12]
 *                  2. double arr[] = new double[12]
 *
 * 2)
 *                  int arr[] = {1,2,3,4,5};
 */

class Task3FoudArifmeticMean{
    public static void main(String[] args) {
        double arr[] = {12.2,12.77,12.456,1.9,9.24,234.199,65.6,48.95,29,5};
            System.out.println(arr.length + " - that's how much elements consist in arr[]");
            double sum = 0;

            for (double x: arr){
                sum += x;
            }
            double average = sum/arr.length;
        System.out.println(sum + " - sum of all elements in arr[]");
        System.out.println(average + " - arifmetic mean");
        }
    }

    class Task6{
        public static void main(String[] args) {
            String arrray = "Java - the best";
            System.out.println(arrray.length());
            System.out.println(arrray.charAt(9));

            int y = 1;
            y = y>0? 10:20;
            System.out.println(y);

            }
        }

