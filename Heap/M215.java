class M215{
    public static void main(String args[]){
        int[] nums={2,3,9,4,8,1};
        int k=2;
        int ans=findKthLartgest(nums, k );
        System.out.println(ans);
    }
    public static int findKthLartgest(int[] nums,int k){
        k=nums.length-k;
        int ans=quickSelect(nums, k, 0, nums.length-1);
        return ans;
    }
    public static int quickSelect(int[] nums,int k, int start, int end){
       
        int p=start;
        int pivote=nums[end];
        int ans=0;
        for (int i = start; i <= end; i++) {
            if (nums[i] <= pivote) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p = p + 1;
            }
        }
        pivote=nums[p];

        if(p>k){
            ans=quickSelect(nums, k, 0, p-1);
        }
        else if(p<k){
            ans=quickSelect(nums, k, p+1, nums.length-1);
        }
        else{
            ans=nums[p];
        }
        return ans; 
    }
}