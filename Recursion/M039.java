import java.util.ArrayList;
import java.util.List;

public class M039 {
    public static void main(String args[]){
        List<List<Integer>> list=new ArrayList<>();
        int nums[]={2,3,5}; 
        list=combinationSum(nums, 8);
        System.out.println(list.toString());
    }
    public static List<List<Integer>> combinationSum(int[] nums,int target){
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combination(nums,target,0,list,ans);
        return ans;
        
    }
    public static void combination(int[] nums,int target,int index,List<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(target>=nums[i]){
                list.add(nums[i]);
                combination(nums, target-nums[i], i, list, ans);
                list.remove(list.size()-1);
            }
        }
    }
}
