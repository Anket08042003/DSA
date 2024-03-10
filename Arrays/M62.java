// public int i=0;
// int j=0;
// public int uniquePaths(int m, int n) {
//     int[][] dp=new int[m][n];
//     for (int i = 0; i < m; ++i) {
//         for (int j = 0; j < n; ++j) {
//             dp[i][j] = -1;
//         }
//     }
//     int path=unique(m,n,0,0,dp);
//     return path;
// } 

// public static int unique(int m,int n,int i,int j,int dp[][]){
//     if(j==n-1 && i==m-1){
//         return 1;
//     }
//     if(j>=n || i>=m){
//         return 0;
//     }
//     if(dp[i][j]!=-1) return dp[i][j];  
//     return dp[i][j]=unique(m,n,i,j+1,dp)+unique(m,n,i+1,j,dp);
// } {
    
// }

public class M62 {
    public static void main(String args[]){
        int ans=uniquePaths(3, 7);
        System.out.println(ans);
    }
    public static int uniquePaths(int m, int n) {
        //optimal solution
        int up = m + n - 2;
        int btm = 1;
        int i=n-1;
        double ans = 1;

        while(btm <= n-1 && i>=1) {
            ans *= up-i+1;
            ans /= btm;
            i--;
            btm++;
        }

        return (int)ans;
    }
    
}
