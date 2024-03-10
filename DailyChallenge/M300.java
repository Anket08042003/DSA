import java.util.Stack;

public class M300 {
    public static void main(String args[]) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int ans = lengthOfLIS(nums);
        System.out.println(ans);
    }

    class Solution {
    

        public int lengthOfLIS(int[] nums) {
            Stack<Integer> st = new Stack<>();
            int i = 0;
            while (i < nums.length) {
                if (st.isEmpty()) {
                    st.add(nums[i]);
                } else if (st.contains(nums[i])) {
                    i++;
                } else if (nums[i] > st.peek()) {
                    st.push(nums[i]);
                } else if (nums[i] == st.peek()) {
                    i++;
                } else if(nums.length-i>st.size()) {
                    
                            while(!st.isEmpty() && st.peek()>nums[i] ){
                                st.pop();
                            }
                            st.push(nums[i]);
                       
                        
                        
                    }
                   
                else{
                 i++;
              }
            }
             
            return st.size();
        }
    }
}
