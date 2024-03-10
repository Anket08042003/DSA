public class E118 {
    public static void main(String args[]){
        int row=5;
        // printRow(row);
        printPascalesTriangle(row);
    }
    public static void printRow(int row){
        int ans=1;
        System.out.print(1+" ");
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static void printPascalesTriangle(int row){
        for(int i=1;i<=5;i++){
            printRow(i);
        }
    }
}
