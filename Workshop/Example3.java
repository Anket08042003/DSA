import java.util.PriorityQueue;

public class Example3 {
    public static void main(String args[]){
        int nums[]={1,13,1,1,13,5,11,11};
        int ans=furthestBuilding(nums, 10, 8);
        System.out.println(ans);
    }
    public static int furthestBuilding(int[] nums, int bricks, int ladders) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                continue;
            }
            if (bricks >= nums[i + 1] - nums[i]) {
                bricks = bricks - (nums[i + 1] - nums[i]);
                q.offer(nums[i + 1] - nums[i]);
                count++;
            }
            if (bricks < nums[i + 1] - nums[i]) {
                if ((bricks>0 || ladders > 0)) {
                    if(q.isEmpty() ){
                       if(ladders>0){
                           q.offer(nums[i+1]-nums[i]);
                           ladders--;
                           continue;
                       }   
                    }
                    int maxEle = q.poll();
                    if (maxEle < nums[i + 1] - nums[i]) {
                        q.offer(nums[i + 1] - nums[i]);
                        ladders--;
                        count++;
                    } else {
                        bricks = bricks + maxEle;
                        ladders--;
                        q.offer(nums[i + 1] - nums[i]);
                        bricks = bricks - (nums[i + 1] - nums[i]);
                    }
                } else if (ladders < 0) {
                    break;
                }
            }
        }
        return count;
    }
}
