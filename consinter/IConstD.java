package consinter;

public class IConstD implements IConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];

        for (int i = MIN; i < 13; i++) {
            if (i >= MAX) {
                System.out.println(ERRORMSG);
                break;
            }else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
