class E121 {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int max=maxProfit(prices);
        System.out.println(max);
    }
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int j=1;
        int max=0;
        while(j<prices.length){
            min=Math.min(min,prices[j-1]);
            max=Math.max(max,prices[j]-min);
            j++;
        }
        return max;
    }
}
