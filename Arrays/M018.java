import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class M018 {
    public static void main(String args[]){
        int nums[]={1,0,-1,0,-2,2};
        List<List<Integer>> list=new ArrayList<>();

        list=fourSum(nums,0);
        System.out.println(list);
    }
     public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> outerList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j];
                    sum+=nums[k];
                    int ans= target-sum;
                    if(set.contains(ans)){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(ans);
                    }
                    set.add(nums[k]);
                }
                outerList.add(list);
                list.clear();
            }
        }
        return outerList;
    }
}
