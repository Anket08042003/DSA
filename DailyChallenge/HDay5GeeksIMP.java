// Given an array arr[] of N elements and a number K., split the given array into K subarrays 
// such that the maximum subarray sum achievable out of K subarrays formed is minimum possible. Find that possible subarray sum.

public class HDay5GeeksIMP {
    public static void main(String args[]){
        int[] arr={1, 2, 3, 4};
        int N=arr.length;
        int k=3;
        int ans=splitArray(arr, N, k);
        System.out.println(ans);
    }
    static int splitArray(int[] arr , int N, int k) {
        // code here
        int maxSum=0;
        int TotalSum=0;
        for(int i=0;i<arr.length;i++){
            TotalSum=TotalSum+arr[i];
            maxSum=Math.max(maxSum, arr[i]);
        }
        int high=TotalSum;
        int low=maxSum;
        int ans=Integer.MAX_VALUE;
        while(high>=low){
            int mid=(high+low)/2;
            if(isValid(arr, mid, k)){
                ans=Math.min(ans, mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] arr, int mid, int k){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum= sum+arr[i];
            }
            else{
                sum=arr[i];
                count++;
            }
        }
        return count<=k;
    }
}
