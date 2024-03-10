import java.util.Arrays;

public class H493 {
    public static void main(String args[]){
        int nums[]={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int count=reversePairs(nums,0,nums.length-1);
        System.out.println(count);
    }
    public static int reversePairs(int[] nums,int s,int e){
        int count=0;
        if(s>=e){
            return 0;
        }
        int mid=(s+e)/2;

        count=reversePairs(nums,s,mid)+reversePairs(nums, mid+1, e);
        int right=mid+1;
        for(int i=s;i<=mid;i++){
            while((long)right<=e && (long)nums[i]>2*(long)nums[right]){
                right++;
            }
            count=count+(right-(mid+1));
           
        }
        Arrays.sort(nums,s,e+1);
        return count;
    }
}
