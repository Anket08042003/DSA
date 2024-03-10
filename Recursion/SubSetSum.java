import java.util.ArrayList;

class SubSetSum{
    public static void main(String args[]){
        int[] arr={5, 2, 1};
        ArrayList<Integer> list=new ArrayList<>();
        subSetSum(arr,list,0,0);
        System.out.println(list.toString());
    }
    public static void subSetSum(int[] arr,ArrayList<Integer> list,int sum, int index){
        if(index==arr.length){
            list.add(sum);
            return;
        }
        subSetSum(arr, list, sum+arr[index], index+1);
        subSetSum(arr, list, sum, index+1);
    }
}