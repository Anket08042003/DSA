import java.util.Stack;

public class MGfgRemoveKDigitsIMP {
    public static void main(String args[]) {
        String s = "149811";
        int k = 3;
        String ans = removeKdigits(s, k);
        System.out.println(ans);
    }

    public static String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            while (k > 0 && !st.isEmpty() && st.peek() > s.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
            i++;
        }

        // Handle the case where we need to remove more digits
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // Reverse the result string and remove leading zeros
        result.reverse();
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
