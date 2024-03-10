import java.util.Arrays;

public class E349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans=new int[Math.max(nums1.length,nums2.length)];
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
                continue;
            }
            if(nums1[i]>nums2[j]){
                j++;
                continue;
            }
            while(k>0 && nums1[i]==ans[k-1]){
                i++;
            }
            while(k>0 && nums2[j]==ans[k-1]){
                j++;
            }
            if(nums1[i]==nums2[j]){
                ans[k]=nums1[i];
                i++;
                j++;
                k++;
                continue;
            }
            
            
            
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
