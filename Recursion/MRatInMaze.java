import java.util.ArrayList;

public class MRatInMaze {
    public static void main(String args[]) {
        int n = 4;
        int[][] a = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> res = findPath(a, n);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }

    public static ArrayList<String> findPath(int[][] a, int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        if (a[0][0] == 1)
            solve(0, 0, a, n, ans, "", temp);
        return ans;
    }

    public static void solve(int i, int j, int[][] a, int n, ArrayList<String> ans, String move, int[][] temp) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }
        // We have to print it in lexicographical order ie down->left->right->up

        // Downward
        if (i + 1 < n && temp[i + 1][j] == 0 && a[i + 1][j] == 1) {
            temp[i][j] = 1;
            solve(i + 1, j, a, n, ans, move + "D", temp);
            temp[i][j] = 0;
        }

        // Left
        if (j - 1 >= 0 && temp[i][j - 1] == 0 && a[i][j - 1] == 1) {
            temp[i][j - 1] = 1;
            solve(i, j - 1, a, n, ans, move + "L", temp);
            temp[i][j - 1] = 0;
        }
        // right
        if (j + 1 < n && temp[i][j + 1] == 0 && a[i][j + 1] == 1) {
            temp[i][j] = 1;
            solve(i, j + 1, a, n, ans, move + 'R', temp);
            temp[i][j] = 0;
        }

        // upward
        if (i - 1 >= 0 && temp[i - 1][j] == 0 && a[i - 1][j] == 1) {
            temp[i][j] = 1;
            solve(i - 1, j, a, n, ans, move + 'U', temp);
            temp[i][j] = 0;
        }
    }
}
