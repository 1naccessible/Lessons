public class AssignAref {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        int i;

        for (i=0;i<10;i++)
            nums1[i]=i;

        for (i=0;i<10;i++)
            nums2[i]=-i;

        System.out.println("Array nums1:");
        for (i=0;i<10;i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.println("Array nums2:");
        for (i=0;i<10;i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;// обе переменные теперь ссылаются на массив nums1

        System.out.println("Array nums2 after assignment");
        for (i=0;i<10;i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2[3]=99;

        System.out.println("Array nums1 after change element [3] in nums2");
        for (i=0;i<10;i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}
