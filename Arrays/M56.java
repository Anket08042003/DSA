import java.util.Arrays;

public class M56 {
    public static void main(String args[]){
        int intervals[][]={{1,4},{5,6}};
        int[] arr=merge(intervals);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int[][] intervals) {
        //optimal solution

        int n=intervals.length;
        Arrays.sort(intervals);
        int arr[][];
        for(int i=0;i<n;i++){
            
        }

        //my approach

        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<intervals.length;i++){
        //     for(int j=0;j<intervals[i].length;j++){
        //         list.add(intervals[i][j]);
        //     }
        // }
        // int i=0;
        // int j=i+1;
        // while(i<list.size()){
        //     j=i+1;
        //     i=i+2;
        //     if(list.get(i)<=list.get(j)){
        //         list.remove(list.get(i));
        //         list.remove(list.get(j));
        //         j=i+1;
        //     }
        //     else if(list.get(i)>list.get(j)){
        //         j=i+1;
        //         i=i+2;
        //     }
        // }
        // int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();
        // return intArray;
    }
}
