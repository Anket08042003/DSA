import java.util.Arrays;

public class Example2 {
    public static void main(String args[]) {
        int[] nums = { 1, 12, 1, 2, 5, 50, 3 };
        long ans = largestPerimeter(nums);
        System.out.println(ans);
    }

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        for (i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (i == nums.length - 1) {
                return nums[i];
            } else if (nums[i - 1] < nums[i] && i > 2) {
                return nums[i - 1];
            }
            else if(i>2 && nums[i-1]>=nums[i]){
                return nums[i-1];
            }
            nums[i] = nums[i] + nums[i - 1];
        }
        return -1;
    }
}
