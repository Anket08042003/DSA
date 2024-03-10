import java.util.Arrays;

public class M75 {
    public static void main(String args[]){
        int nums[]={2,0,1,1,0,1,1,1,2,2,0,0,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        //better solution with o(2n) complexity
        // int count0=0;
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count0++;
        //     }
        //     if(nums[i]==1){
        //         count1++;
        //     }
        //     if(nums[i]==2){
        //         count2++;
        //     }
        // }
        // int j=0;
        // while(j<count0){
        //     nums[j]=0;
        //     j++;
        // }
        // while(j<count0+count1){
        //     nums[j]=1;
        //     j++;
        // }
        // int count01=count0+count1;
        // while(j<count01+count2){
        //     nums[j]=2;
        //     j++;
        // }

        //optimal solution
        int mid=0;
        int low=0;
        int high=nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }

    }
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
