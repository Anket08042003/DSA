import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class H051 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> outerList = new ArrayList<>();
        List<String> innerList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        boolean[] foundSolution = {false};  // Added boolean variable
        ans(n, 0, outerList, innerList, set, foundSolution);
        return outerList;
    }

    public static void ans(int n, int row, List<List<String>> outerList, List<String> list, HashSet<Integer> set, boolean[] foundSolution) {
        int j = 0;
        while (row < n && j < n) {
            if (foundSolution[0]) {
                return;  // Stop further exploration if a solution is found
            }
            
            if (j == n - 1) {
                if (!set.contains(j + 1) && (j == 0 || !set.contains(j - 1))) {
                    set.add(j + 1);
                    list.add("Q");
                    outerList.add(new ArrayList<>(list));
                    List<String> newList = new ArrayList<>();
                    ans(n, row + 1, outerList, newList, set, foundSolution);
                    row++;
                    foundSolution[0] = true;  // Set the flag to true once a solution is found
                }
            } else if (!set.contains(j + 1) && (list.size() > j + 1 && list.get(j + 1) == null || list.size() > j && list.get(j) == null)) {
                set.add(j + 1);
                list.add("Q");
                outerList.add(new ArrayList<>(list));
                List<String> newList = new ArrayList<>();
                ans(n, row + 1, outerList, newList, set, foundSolution);
                row++;
                foundSolution[0] = true;  // Set the flag to true once a solution is found
            } else {
                list.add(".");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        H051 solution = new H051();
        List<List<String>> result = solution.solveNQueens(4);

        // Display the result
        for (List<String> configuration : result) {
            System.out.println(configuration);
        }
    }
}
