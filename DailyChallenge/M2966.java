import java.util.Arrays;

public class M2966 {
   public static void main(String args[]){
        int[] nums={1,3,3,2,7,3};
        int ans[][]=divideArray(nums, 3);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;i++){
                System.out.println(ans[i][j]);
            }
        }
   }
   public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length / 3][3];
        int i=0;
        int j=0;
        int m=0;
        int c=0;
        while(i<ans.length){
            j=0;
            int[] inside=new int[3];
            while(j<3 && m < nums.length && c<nums.length){
               if(nums[c] - nums[m]<= k){
                   
                   inside[j]=nums[c];
               }
               else{
                   return new int[0][0];
               }
               c++;
               j++;
            }
            ans[i]=inside;
            m=m+3;
            i++;
        }
        return ans;
    } 
    
}