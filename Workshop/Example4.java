public class Example4 {
    public static void main(String args[]){
        int nums[]={1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(nums, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(n==0){
                return true;
            }
            if(flowerbed[i]==0){
                if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(i==flowerbed.length-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(i>0 && flowerbed[i-1]==0 && i<flowerbed.length-1  && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
                else{
                    continue;
                }
            }
            else{
                continue;
            }
        }
        return false;
    }
}
