import java.util.Stack;

public class H084 {
    public static void main(String args[]) {
        int nums[] = { 2, 1, 5, 6, 2, 3 };
        int ans = largestRectangleArea(nums);
        System.out.println(ans);
    }

    public static int largestRectangleArea(int[] nums) {
        // brute force approach

        // int nums.length = nums.length;
        // int i = 0, j = 0, k = 0, max = 0;

        // while (k < nums.length) {
        // int height = (k == nums.length - 1) ? 0 : nums[k];

        // if (i >= 0 && (k == nums.length - 1 || nums[i] > height)) {
        // i--;
        // }

        // if (j < nums.length && (k == nums.length - 1 || nums[j] > height)) {
        // j++;
        // }

        // if (i < 0 || (j < nums.length && nums[j] < height)) {
        // int width = j - i - 1;
        // max = Math.max(max, height * width);
        // k++;
        // i = k - 1;
        // j = k + 1;
        // }
        // }

        // return max;

        // optimal approach

        Stack<Integer> st = new Stack<>();
        int[] leftLimit = new int[nums.length];
        int[] rightLimit = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty())
                leftLimit[i] = 0;
            else
                leftLimit[i] = st.peek() + 1;
            st.push(i);
        }
        while (!st.isEmpty())
            st.pop();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (st.isEmpty())
                rightLimit[i] = nums.length - 1;
            else
                rightLimit[i] = st.peek() - 1;

            st.push(i);
        }
        int maxA = 0;
        for (int i = 0; i < nums.length; i++) {
            maxA = Math.max(maxA, nums[i] * (rightLimit[i] - leftLimit[i] + 1));
        }
        return maxA;
    }

}
