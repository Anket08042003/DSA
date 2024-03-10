public class M74 {
    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean found=searchMatrix(matrix,3);
        System.out.println(found);
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int start=0;
        int end=((matrix.length)*(matrix[0].length))-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            int row=mid/matrix[0].length;
            int col=mid % matrix[0].length;
            if(matrix[row][col]==target){
                return true;
            }
            else if(target<matrix[row][col]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    }

}