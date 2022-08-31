//Применение внутреннего класса
public class Outer {
    int nums[];

    Outer(int n[]){
        nums = n;
    }

    void analyze(){
        Inner inOb = new Inner();

        System.out.println("max: " + inOb.max());
        System.out.println("min: " + inOb.min());
        System.out.println("avg: " + inOb.avg());
    }
    //Внутренний класс
    class Inner{
        int min(){
            int m = nums[0];

            for (int i = 1; i<nums.length;i++)
                if (nums[i]<m) m = nums[i];
            return m;
        }

        int max(){
            int m = nums[0];

            for (int i = 1; i<nums.length; i++)
            if(nums[i]>m) m=nums[i];
            return m;
    }
        int avg(){
            int a = 0;
            for (int x = 0; x<nums.length;x++ ){
             a += nums[x];
            }
            return a/nums.length;
        }

    }

}

class NestedClassDemo{
    public static void main(String[] args) {
        int x[] = {3,2,1,6,8,7,9,5};

        Outer outOb = new Outer(x);

        outOb.analyze();
    }
}
