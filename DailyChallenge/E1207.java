import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class E1207 {
    public static void main(String args[]){
        int arr[]={1,2};
        boolean ans=uniqueOccurrences(arr);
        System.out.println(ans);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                list.add(count);
                count=1;
            }
        }
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        int a=list.size();
        int b=set.size();
        return a==b;
    }
}
