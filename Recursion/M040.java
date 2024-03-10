import java.util.ArrayList;
import java.util.List;

class M040{
    public static void main(String args[]){
        int[] nums={10,1,2,7,6,1,5};
        List<List<Integer>> list=new ArrayList<>();
        list=combinationSum2(nums,8);
        System.out.println(list.toString());
    }
    public static List<List<Integer>> combinationSum2(int[] nums,int target){
        List<List<Integer>> list=new ArrayList<>();
        combinations(nums,target,0,list,new ArrayList<>());
        return list;
    }
    public static void combinations(int[] nums, int target, int index, List<List<Integer>> list, List<Integer> innerList) {
    if (target == 0) {
        list.add(new ArrayList<>(innerList));
        return;
    }

    for (int i = index; i < nums.length; i++) {
        // Skip duplicates
        if (i > index && nums[i] == nums[i - 1]) {
            continue;
        }

        if (nums[i] <= target) {
            innerList.add(nums[i]);
            combinations(nums, target - nums[i], i + 1, list, innerList);
            innerList.remove(innerList.size() - 1);
        }
    }
}

}