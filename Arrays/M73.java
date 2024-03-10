class M73{
    static int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};;
    public static void main(String args[]){
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int m[][]){
        // BruteForce approach
        // for(int i=0;i<m.length;i++){
        //     for(int j=0;j<m[0].length;j++){
        //         if(m[i][j]==0){
        //             for(int k=0;k<m[0].length;k++){
        //                 m[i][k]=-1;
        //             }
        //             for(int k=0;k<m.length;k++){
        //                 m[k][j]=-1;
        //             }
        //         }
        //     }
        // }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //         if(m[i][j]==-1){
        //             m[i][j]=0;
        //         }
        //     }
        // }


        //better approach
        int R[]=new int[m.length];
        int C[]=new int[m[0].length];

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==0){
                    R[i]=1;
                    C[j]=1;
                }
               
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(R[i]==1 || C[j]==1){
                    m[i][j]=0;
                }
                
            }
        }



    }
}