import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
public class M102 {
    public static void main(String args[]){
        // Create the tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Create an instance of M102 class
        M102 solution = new M102();

        // Call the levelOrder function and print the result
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(); // Corrected: LinkedList instead of LinkList
        int indx = 0;
        
        if (root != null) { // Added check for null root
            q.add(root);
            index.add(indx);
            list.add(root.val);
            while (!q.isEmpty()) {
                TreeNode ele = q.remove();
                if (ele.left != null) {
                    q.add(ele.left);
                    list.add(ele.left.val);
                    index.add(indx + 1);
                }
                if (ele.right != null) {
                    q.add(ele.right);
                    list.add(ele.right.val);
                    index.add(indx + 1);
                }
                if(ele.right==null && ele.left==null){
                    continue;
                }
                indx++;
            }
        }

        int pos = 0;
        int prev = 0;
        while (pos < list.size() - 1) { 
            if (index.get(pos) != index.get(pos + 1)) {
                ans.add(new ArrayList<>(list.subList(prev, pos + 1))); 
                prev = pos + 1;
            }
            pos++;
        }
        return ans;
    }

}
