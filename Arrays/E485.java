public class E485 {
    public static void main(String args[]){
        int nums[]={1,0,1,1,0,1};
        int max= findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
                i++;
            }
            else{
                max=Math.max(max,count);
                count=0;
                i++;
            }
        }
        return max;
    }
}
