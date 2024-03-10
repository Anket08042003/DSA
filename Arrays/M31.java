import java.util.Arrays;

public class M31 {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        // optimal solution
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            rev(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[index] < nums[i]) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            rev(nums, index+1, nums.length - 1);
        }

    }

    public static void rev(int[] nums, int start, int end) {

        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

}
