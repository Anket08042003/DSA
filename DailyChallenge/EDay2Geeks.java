import java.util.Deque;
import java.util.LinkedList;

public class EDay2Geeks {
    public static void main(String args[]){
        String S="022001";
        int ans=smallestSubstring(S);
        System.out.println(ans);
    }
    public static int smallestSubstring(String S) {
        // Code here
        int n = S.length();
        int count0 = 1;
        int count1 = 1;
        int count2 = 1;
        Deque<Character> deque = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            char currentChar = S.charAt(i);

            if (n < 3) {
                return -1;
            }

            if (deque.isEmpty()) {
                deque.add(currentChar);
                if (currentChar == '0') {
                        count0--;
                    } else if (currentChar == '1') {
                        count1--;
                    } else {
                        count2--;
                    }
            } else {
                char check = deque.pollFirst();
                if(count0 <= 0 && count1 <= 0 && count2 <= 0){
                    deque.offerFirst(check);
                    break;
                }
                else if (check == currentChar && (count0 != 0 || count1 != 0 || count2 != 0)) {
                    deque.add(currentChar);
                } else if (check != currentChar && (count0 != 0 || count1 != 0 || count2 != 0)) {
                    deque.offerFirst(check);
                    deque.add(currentChar);
                    if (currentChar == '0') {
                        count0--;
                    } else if (currentChar == '1') {
                        count1--;
                    } else {
                        count2--;
                    }
                } 
                
            }
        }
        
        return deque.size();
    }
}
