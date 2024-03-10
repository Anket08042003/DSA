import java.util.ArrayList;

public class EGfgLeftViewBT {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list=new ArrayList<>();
      left(root, list, 0);
      return list;
    }
    public static void left(Node root, ArrayList<Integer> list, int len){
        if(root==null){
            return;
        }
        if(len==list.size()){
            list.add(root.data);
        }
        left(root.left, list, len+1);
        left(root.right, list, len+1);
        
    }
}