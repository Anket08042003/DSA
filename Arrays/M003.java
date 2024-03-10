import java.util.HashMap;
import java.util.HashSet;

public class M003 {
   public static void main(String args[]){
    String a="abcabcdbb";
    int len=lengthOfLongestSubstring(a);
    System.out.println(len);
   }
   public static int lengthOfLongestSubstring(String a){
    //better soluton
//     HashSet<Character> set=new HashSet<>();
//     int r=0;
//     int l=0;
//     int longest=0;
//     while(r<a.length() && l<=r){
//         if(! set.contains(a.charAt(r))){
//             set.add(a.charAt(r)); 
//             r++;   
//         }
//         else{
//             longest=Math.max(longest,r-l);
//             set.remove(a.charAt(l));
//             l++;
//         }
//     }
//     return longest;
//    }

//    optimal solution

        HashMap<Character,Integer> map=new HashMap<>();
        int r=0;
        int l=0;
        int longest=1;
        while(r<a.length()){
            if(map.containsKey(a.charAt(r))){
                l=map.get(a.charAt(r))+1;
                
            }
            map.put(a.charAt(r),r);
            longest=Math.max(longest,r-l+1);
            r++;
        }
        return longest;
    }
}
