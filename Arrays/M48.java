import java.util.Arrays;

public class M48 {
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void rotate(int[][] matrix){
        //better approach tc=o(n^2) and constant space complexity
        
        
    }
    public static void swap(int[][] matrix, int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public static void Swap(int matrix[][],int i,int j,int k){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[i][k];
        matrix[i][k]=temp;
    }
}
