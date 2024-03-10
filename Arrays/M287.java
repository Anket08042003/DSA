import java.util.Arrays;

public class M287 {
    public static void main(String args[]){
        int nums[]={1,3,3,4,2};
        int duplicate[]=findDuplicate(nums);
        System.out.println(Arrays.toString(duplicate));
    }
    public static int[] findDuplicate(int nums[]){
        int index=0;
        int arr[]={0,0};
        while(index<nums.length){
            int correctIndex=nums[index]-1;
            if(nums[index]!=nums[correctIndex]){
                swap(nums,index,correctIndex);
            }
            else{
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                arr[0]=nums[i];
                arr[1]=i+1;
            }
        }
        return arr;
    }
    public static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
