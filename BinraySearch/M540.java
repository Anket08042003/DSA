import java.util.HashMap;
import java.util.Map;

public class M540 {
    public static void main(String args[]){
        int[] nums={1,1,2,9,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
    public static int singleNonDuplicate(int[] nums){
        //my soluton
        // HashMap<Integer, Integer> map=new HashMap<>();
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        // }
        //  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         ans = entry.getKey();  // Set ans to the key with count 1
        //         break;  // No need to continue searching
        //     }
        // }
        // return ans;

        //optimal solution
        if(nums.length==0){
            return 0;
        }
        int left=0;
        int right=nums.length-2;
        while(left<right){
           int mid=(right+left)/2;
           if(mid%2==0){
               if(nums[mid]==nums[mid+1]){
                   left=mid+2;
               }
               else{
                   right=mid;
               }
           }
           else{
               if(nums[mid]==nums[mid+1]){
                   right=mid-1;
               }
               else{
                   left=mid+1;
               }
           }
        }
        return nums[left];
    }
}
