import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class M090 {
    public static void main(String args[]) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        
        list=subsetsWithDup(nums, 0, innerList, outerList);
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        System.out.println(ans.toString());
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums, int index, List<Integer> innerList, List<List<Integer>> outerList) {
        if (index == nums.length) {
            outerList.add(new ArrayList<>(innerList)); // Add a copy of innerList to outerList
            return outerList;
        }
        innerList.add(nums[index]);
        outerList = subsetsWithDup(nums, index + 1, innerList, outerList);
        innerList.remove(innerList.size() - 1); // Backtrack by removing the last element
        outerList = subsetsWithDup(nums, index + 1, innerList, outerList);
        return outerList;
    }
}
