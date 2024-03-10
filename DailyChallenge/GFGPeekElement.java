public class GFGPeekElement {
    public static void main(String args[]){
        int[] arr={1,2,3};
        System.out.println(peekElement(arr));
    }
    public static int peekElement(int[] arr){
        int n=arr.length;
        if(arr[0]>=arr[1]){
            return 1;
        }
        if(arr[n-1]>=arr[n-2]){
            return 1;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<=arr[i] && arr[i+1]<=arr[i]){
                return 1;
            }
        }
        return 0;
    }
}
