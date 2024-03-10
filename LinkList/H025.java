public class H025 {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display the original linked list
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        // Reverse k nodes in the linked list
        int k = 2; // You can change this value to test different k values
        H025 solution = new H025();
        ListNode reversedHead = solution.reverseKGroup(head, k);

        // Display the reversed linked list
        System.out.println("\nReversed Linked List with k=" + k + ":");
        displayLinkedList(reversedHead);
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        // Count the number of nodes in the list
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Reverse k nodes at a time
        while (count >= k) {
            ListNode start = prev.next;  // Start of the current group
            ListNode nex = curr.next;    // Next node after the current group

            for (int i = 1; i < k; i++) {
                if (nex == null) {
                    break;  // Break if fewer than k nodes are remaining
                }

                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }

            prev = start;  // Move to the next group
            curr = nex;    // Move to the next starting node
            count -= k;
        }

        return dummy.next;
    }
    // Helper method to display a linked list
    private static void displayLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
