import java.util.Arrays;

class M739{
    public static int[] dailyTemperatures(int[] temperature) {
        int[] ans=new int[temperature.length];
        int i=0;
        int count=1;
        while(i<ans.length){
            if(i==ans.length-1){
                ans[i]=0;
                i++;
                continue;
            }
            int j=i+1;
            while(j<ans.length && temperature[i]>=temperature[j]){
                count++;
                j++;
            }
            if(j==ans.length && temperature[i]>=temperature[j-1]){
                ans[i]=0;
                i++;
                count=1;
                continue;
            }
            ans[i]=count;
            count=1;
            i++;
        }
        return ans;
    }
    public static void main(String args[]){
        int[] temperature={55,38,53,81,61,93,97,32,43,78};
        int[] ans=new int[temperature.length];
        ans=dailyTemperatures(temperature);
        System.out.println(Arrays.toString(ans));
    }
}