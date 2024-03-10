import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class McoloringProblem {
    public static void main(String[] args) {
        // Create a graph with 4 nodes and edges between nodes 0 and 1, 1 and 2, and 2
        // and 3
        List<Integer>[] graph = new List[4];
        graph[0] = new ArrayList<>(Arrays.asList(1));
        graph[1] = new ArrayList<>(Arrays.asList(2));
        graph[2] = new ArrayList<>(Arrays.asList(3));
        graph[3] = new ArrayList<>();

        // Create an array to store the colors of the nodes
        int[] colors = new int[4];

        // Initialize colors with 1
        Arrays.fill(colors, 1);

        // Try coloring the graph with 4 colors
        if (graphColoring(graph, colors, 2)) {
            System.out.println("The graph can be colored with 2 colors.");
            for (int i = 0; i < colors.length; i++) {
                System.out.println("Node " + i + " is colored " + colors[i]);
            }
        } else {
            System.out.println("The graph cannot be colored with 2 colors.");
        }
    }

    public static boolean graphColoring(List<Integer>[] graph, int[] color, int m){
        int n=graph.length;
        if(isColorable(graph, n, m, 0, color)==true) return true;
        return false;
    }
    public static boolean isColorable(List<Integer>[] graph, int n, int m, int node, int[] color){
        if(node == n) return true;

        for(int i=1;i<=m;i++){
            if(isSafe(node, color, i, graph)){
                color[node]=i;
                if(isColorable(graph, n, m, node+1, color)==true) return true;
                color[node]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int node, int[] color, int clr, List<Integer>[] graph){
        for(int i: graph[node]){
            if(color[i]==clr){
                return false;
            }
        }
        return true;
    }
}
