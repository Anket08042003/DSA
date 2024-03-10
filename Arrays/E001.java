import java.util.ArrayList;
import java.util.Arrays;

public class E001 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans=new int[2];
        ans=twoSum(nums,9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums,int target){
        mergeSort(nums);
        ArrayList<Integer> list=new ArrayList<>();

        int i=0;
        int j=nums.length-1;
        int ans=0;
        while(i<nums.length && nums[i]<target){
            if(nums[j]<target){
                ans=nums[i]+nums[j];
                if(ans>target && j>i){
                    ans=0;
                    j--;
                }
                else if(ans<target && j>i){
                    ans=0;
                    i++;
                }
                else if(j<= i){
                    break;
                }
                else{
                    list.add(nums[i]);
                    list.add(nums[j]);
                    break;
                }
            }
            else{
                j--;
            }
        }
        int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Already sorted
        }

        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, middle, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
