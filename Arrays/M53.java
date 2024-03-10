public class M53 {
    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=maxSubArray(nums);
        System.out.println(max);
    }
    public static int maxSubArray(int nums[]){
        //brute force
        // int max=0;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         for(int k=i;k<=j;k++){
        //             sum=sum+nums[k];
        //         }
        //         max=Math.max(max, sum);
        //         sum=0;
        //     }
        // }
        // return max;

        //Better Solution
        // int max=0;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //             sum=sum+nums[j];
               
        //         max=Math.max(max, sum);
                
        //     }
        //     sum=0;
        // }
        // return max;

        //Optimal Solution
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max, sum);
        }
        return max;
    }
}
