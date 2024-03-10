
public class AllSubArrays {

    public static int min=Integer.MAX_VALUE;
    public static int sum=0;
    public static int sumSubarrayMins(int[] array) {
        int start=0;
        int end=array.length-1;
        if (start == end) {
            
            return array[start];
        }

        for (int i = start; i <= end; i++) {
            min=Integer.MAX_VALUE;
            for (int j = i; j <= end; j++) {
                createSubArray(array, i, j);
            }
        }

        return sum; 
    }

    private static void createSubArray(int[] array, int start, int end) {
        for (int k = start; k <= end; k++) {
            min=Math.min(min,array[k]);
        }
        sum=sum+min;
    }

    public static void main(String[] args) {
        int[] exampleArray = {3,1,2,4};
        int ans = sumSubarrayMins(exampleArray);

        System.out.println(ans);
 
}
}
    
     