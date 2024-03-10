public class H042 {
    public static void main(String args[]){
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int amount=trap(height);
        System.out.println(amount);
    }
    public static int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
      
       int sum=0;
       for(int i=1;i<height.length-1;i++){
           int left=height[i];
           int right=height[i];
           int j=i;
           int k=i;
           while(j>=0 || k<height.length){
               if(j>=0){
                 left=Math.max(left,height[j]);
                 j--;
               }
               if(k<height.length){
                   right=Math.max(right,height[k]);
                   k++;
               }
               
           }
           sum=sum+Math.min(right,left)-height[i];
       } 
        
        return sum;
    }
}
