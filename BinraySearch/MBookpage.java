public class MBookpage {
    public static void main(String args[]){
        int[] pages={44,33,122,77,11,20};
        int students=2;
        int ans=letsFind(pages, students);
        System.out.println(ans);
    }
    public static int letsFind(int[] pages, int students){
        int start=0;
        int end=pages[0]+pages[1]+pages[2]+pages[3];
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            boolean isPossible=calculate(students, pages, mid);
            if(isPossible){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean calculate(int students, int[] pages, int mid){
        int i=0;
        int count=1;
        int sum=0;
        while(i<pages.length){

            if(sum<=mid){
                sum=sum+pages[i];
                i++;
            }
            else{
                sum=0;
                count++;
            }
        }
        if(count==2) return true;
        return false;
    }
}
