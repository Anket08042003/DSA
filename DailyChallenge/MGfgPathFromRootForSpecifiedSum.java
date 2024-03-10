import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MGfgPathFromRootForSpecifiedSum {
    public static void main(String args[]) {
        // Creating the tree
        Node root = new Node(1);
        root.left = new Node(20);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(15);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(9);

        ArrayList<ArrayList<Integer>> outerList=new ArrayList<>();
        outerList=printPaths(root, 8);
        System.out.println(outerList.toString());
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> outerList=new ArrayList<>();
        ArrayList<Integer> innerList=new ArrayList<>();
        cal(root, root.data, sum, outerList, innerList);
        return outerList;
    }
    public static void cal(Node root, int ourSum, int sum, ArrayList<ArrayList<Integer>> outerList, ArrayList<Integer> innerList){
        if(root==null){
            return;
        }
        if(ourSum>sum){
            return; 
        }
        innerList.add(root.data);
        System.out.println(root.data);
        if(ourSum==sum){
            outerList.add(new ArrayList<>(innerList));
            return;
        }
        
        cal(root.left, ourSum+root.left.data, sum, outerList, innerList);
        cal(root.right, ourSum+root.right.data, sum, outerList, innerList);
    }
}
