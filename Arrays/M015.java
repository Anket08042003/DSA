import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M015 {  
    public static void main(String args[]){
        List<List<Integer>> list=new ArrayList<>();
        int[] nums={-1,0,1,2,-1,-4};
        list=threeSum(nums);
        System.out.println(list.toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int k=i+1;
        int sum=0;
        while(i<nums.length-2){
            k=i+1;
            while(k<j){
                List<Integer> innerList=new ArrayList<>();
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[k]);
                    list.add(innerList);
                    k++;
                }
                else if(sum>0){
                    j--;
                }
                else{
                    k++;
                }
                
            }
            if(k==j){
                j=nums.length-1;
                i++;
            }
        }
        
        return list;
    }
}
