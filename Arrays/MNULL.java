import java.util.HashMap;
import java.util.Map;

public class MNULL {
    public static void main(String args[]){
        int nums[]={1,2,3,1,1,1,4,2,3};
        int ans=LongestSubsetWithKSum(nums, 6);
        System.out.println(ans);
    }
    public static int LongestSubsetWithKSum(int nums[],int k){
        //better solution
        // HashMap<Integer, Integer> map= new HashMap<>();

        // int longest=1;
        // int sum=0;
       
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     if(sum==k){
        //         map.put(sum,i+1);
        //         longest=Math.max(i+1, longest);
        //     }
        //     else if(sum>k){
        //         map.put(sum,i+1);
        //         int remaining=sum-k;
        //         if(map.containsKey(remaining)){
        //             longest=Math.max(i+1-map.get(remaining),longest);
        //         }
        //     }
        //     else{
        //         map.put(sum,i+1);
        //     }
        // }
        // return longest;

        //optimal solution
        int i=0;
        int j=0;
        int sum=0;
        int longest=1;
        while(i>=j && i<nums.length){
            if(sum<k){
                sum=sum+nums[i];
                i++;
            }
            else if(sum==k){
                longest=Math.max(longest,i-j-1);
                sum=sum+nums[i];
            }
            else{
                sum=0;
                j++;
            }
        }
        return longest;
    }
}
