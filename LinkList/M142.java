import java.util.ArrayList;

public class M142 {
    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2; // This creates a cycle

        // Use the detectCycle method
        M142 solution = new M142();
        ListNode cycleStartNode = solution.detectCycle(head);

        // Print the result
        if (cycleStartNode != null) {
            System.out.println("Cycle detected. The cycle starts at node with value: " + cycleStartNode.val);
        } else {
            System.out.println("No cycle found.");
        }
    }
    public ListNode detectCycle(ListNode head) {
        // My Approach
        // ArrayList<ListNode> list = new ArrayList<>();
        // ListNode dummy = head;

        // while (dummy != null) {
        //     if (list.contains(dummy)) {
        //         return dummy; // Cycle detected, return the node where the cycle begins
        //     }

        //     list.add(dummy);
        //     dummy = dummy.next;
        // }

        // return null; // No cycle found

        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        ListNode dummy=head;
        
        while(dummy!=null){
            if(dummy==slow){
                break;
            }
            dummy=dummy.next;
            slow=slow.next;
        }
        
        return dummy;
    }
}
