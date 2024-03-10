public class MCows {
    public static void main(String arg[]){
        int n=4;
        int max=0;
        int arr[]={1,2,5,7,10};
        for(int i=1;i<arr[arr.length-1]-arr[0];i++){
            if(possible(arr, n, i)){
                max=Math.max(max, i);
            }
        }
        System.out.println(max);
    }
    public static boolean possible(int[] arr, int n, int i){
        int countCow=1;
        int last=arr[0];
        for(int j=1;j<arr.length-1;j++){
            if(arr[j]-last>=i){
                countCow++;
                last=arr[j];
            }
        }
        if(countCow >= n){
            return true;
        }
        return false;
    }
}
