import java.util.*;

public class H239 {
    public static void main(String args[]){
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] ans=new int[arr.length-k+1];
        ans=maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
       ArrayList<Integer> list=new ArrayList<>();
       ArrayList<Integer> ans=new ArrayList<>();
       int i=0;
       int j=0;
       int max=0;
       while(i<nums.length){
          if(j<k){
            list.add(nums[i]);
            j++;
            i++;
          }
          else{
            max=Collections.max(list);
            ans.add(max);
            list.remove(0);
            j--;
          }

       }
       ans.add(Collections.max(list));
       return listToIntArray(ans);
    }
    public static int[] listToIntArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
