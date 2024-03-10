import java.util.Arrays;
import java.util.HashSet;

public class M128 {
    public static void main(String args[]){
        int nums[]={-1, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9};
        int L=longestConsecutive(nums);
        System.out.println(L);
    }
    //BETTER SOLUTION
    // public static int longestConsecutive(int[] nums) {
    //     if(nums.length == 0){
    //         return 0;
    //     }
    //     mergeSort(nums);
    //     System.out.println(Arrays.toString(nums));
    //     int k=0;
    //     int count=1;
    //     int longest=0;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i]==nums[i-1]+1){
    //             count++;
    //             longest=Math.max(count,longest);
    //         }
    //         else if(nums[i]>nums[i-1]+1){
    //             longest=Math.max(count,longest);
    //             count=1;
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     return longest;
    // }

   
    // public static void mergeSort(int[] arr) {
    //     if (arr.length <= 1) {
    //         return;
    //     }

    //     int mid = arr.length / 2;
    //     int[] left = new int[mid];
    //     int[] right = new int[arr.length - mid];

    //     System.arraycopy(arr, 0, left, 0, mid);
    //     System.arraycopy(arr, mid, right, 0, arr.length - mid);

    //     mergeSort(left);
    //     mergeSort(right);

    //     merge(left, right, arr);
    // }

    // public static void merge(int[] left, int[] right, int[] arr) {
    //     int i = 0, j = 0, k = 0;

    //     while (i < left.length && j < right.length) {
    //         if (left[i] <= right[j]) {
    //             arr[k++] = left[i++];
    //         } else {
    //             arr[k++] = right[j++];
    //         }
    //     }

    //     while (i < left.length) {
    //         arr[k++] = left[i++];
    //     }

    //     while (j < right.length) {
    //         arr[k++] = right[j++];
    //     }
    // }

    // OPTIMAL SOLUTION
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=1;
        int longest=1;
        int j=0;
        for (int element : set) {
           if(set.contains(element-1)){
            continue;
           }
           else{
            j=element+1;
            while(set.contains(j)){
                count=count+1;
                j++;
                longest=Math.max(count,longest);
            }
            count=1;
           }
        }
        return longest;

    }
}
