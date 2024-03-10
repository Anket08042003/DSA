import java.util.ArrayList;

public class MRootToNodePath {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val=val;
            this.right=null;
            this.left=null;
        }
        
    }
    
    private static boolean getPath(TreeNode root, ArrayList<Integer> list, int x){
        if(root==null){
            return false;
        }
        list.add(root.val);
        if(root.val==x){
            return true;
        }
        if(getPath(root.left, list, x) || getPath(root.right, list, x)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}
