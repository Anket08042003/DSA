import java.util.HashMap;

public class E3005 {
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        int ans=maxFrequencyElements(nums);
        System.out.println(ans);
    }
    public static int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
            int[] ans=new int[nums.length];
            int i=0;
            for(int key: map.keySet()){
                ans[i]=map.get(key);
                i++;
            }
            int max=0;
            for(int j=0;j<ans.length;j++){
                max=Math.max(max, ans[j]);
            }
            int count=0;
            for(int j=0;j<ans.length;j++){
                System.out.println(nums[j]);
                if(nums[j]==max){
                    count++;
                }
            }
            return max*count;
        
    }
}

