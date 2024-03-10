import java.util.Arrays;
import java.util.HashMap;

public class M2870 {
    public static void main(String args[]){
        int nums[]={14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        int ans=minOperations(nums);
        System.out.println(ans);
    }
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int sum=0;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if(value%3==0 ){
                
              sum=sum+(value/3);  
            }
            else if(value%3!=0 && value>4){
                while(value>4){
                    sum=sum+1;
                    value=value-3;
                }
                while(value>0){
                    sum=sum+1;
                    value=value-2;
                }
            }
            else if(value%3==1 && value%2==1){
                return -1;
            }
            else{
              
                sum=sum+(value/2);
            }
        }
        return sum;
    }

}
