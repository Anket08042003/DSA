import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M229 {
    public static void main(String args[]){
        int nums[]={3,2,3,2,2,2,3};
        List<Integer> list=new ArrayList<>();
        list=majorityElement(nums);
        System.out.println(list); 
    }
    public static List<Integer> majorityElement(int[] nums){
        //better solution
        // HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list= new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if (map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     } else {
        //         map.put(nums[i], 1);
        //     }
        // }
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        //     if(e.getValue()>nums.length/3){
        //         list.add(e.getKey());
        //     }
        // }
        // return list;

        //optimal solution
        int cnt1=0;
        int cnt2=0;
        int elm1=Integer.MIN_VALUE;
        int elm2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=elm2){
                elm1=nums[i];
                cnt1++;
            }
            else if(cnt2==0 && nums[i]!=elm1){
                elm2=nums[i];
                cnt2++;
            }
            else if(nums[i]==elm1){
                cnt1++;
            }
            else if(nums[i]==elm2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elm1) cnt1++;
            if(nums[i]==elm2) cnt2++;
        }
        if(cnt1>nums.length/3) list.add(elm1);
        if(cnt2>nums.length/3) list.add(elm2);
        
        return list;
    }
}
