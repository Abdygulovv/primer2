import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[901];
        int nums = 100;
        for (int i = 0; i < num.length; i++) {
            num[i] = nums;
            nums++;
        }
        System.out.println(Arrays.toString(num));

        System.out.println("-------");

        int[] num1 = new int[901];
        int nums1;
        int num2 = num.length;
        for (int i =0; i < num.length; i++) {
            nums1 = num[num2 -i - 1];
            num1[i] = nums1;
        }
        System.out.println(Arrays.toString(num1));

        System.out.println("-------");


        for (int nums2 : num1) {
           System.out.println(nums2);

       }

    }
}





