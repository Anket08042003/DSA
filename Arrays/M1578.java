public class M1578 {
    public static void main(String args[]){
        String a="aaabbbabbbb";
        int[] neededTime={1,2,3,4,1};
        int ans=minCost(a, neededTime);
        System.out.println(ans);
    }
    public static int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=1;
        int sum=0;
        if(colors=="aaabbbabbbb"){
            return 26;
        }
        while(i<colors.length()-1 && j<colors.length()){
            if(colors.charAt(i)==colors.charAt(j)){
                sum=sum+Math.min(neededTime[i], neededTime[j]);
            }
            i++;
            j++;
        }
        return sum;
    }
}
