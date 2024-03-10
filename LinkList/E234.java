public class E234 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 2 -> 1 (palindrome)
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));

        // Create an instance of the Solution class
        E234 solution = new E234();

        // Call the isPalindrome method and print the result
        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
    // my Solution
    // public boolean isPalindrome(ListNode head) {
    //     StringBuilder sb=new StringBuilder();
    //     StringBuilder sb2=new StringBuilder();
    //     ListNode head=head;
    //     int count=1;
        
    //     while(head.next!=null){
    //         head=head.next;
    //         count++;
    //     }
    //     head=head;
    //     int mid=count/2;
    //     int i=1;
    //     while(count%2==0 && i<=mid){
    //         sb.append(head.val);
    //         head=head.next;
    //         i++;
    //     }
    //     while(count%2!=0 && i<=mid){
    //         sb.append(head.val);
    //         head=head.next;
    //         i++;
    //     }
    //     while(count%2==0 && i<=count){
    //         sb2.append(head.val);
    //         head=head.next;
    //         i++;
    //     }
    //     while(count%2!=0 && i<count){
    //         head=head.next;
    //         sb2.append(head.val);
    //         i++;
    //     }
    //     System.out.println(sb.toString());
    //     System.out.println(sb2.toString());
    //     return sb.reverse().toString().equals(sb2.toString());
    // }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode nxt=null;
        while(head.next!=null){
            nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}
