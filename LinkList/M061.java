public class M061 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        // Display the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Call the rotateRight method
        M061 solution = new M061();
        int k = 5; // Replace with your desired rotation count
        ListNode rotatedHead = solution.rotateRight(head, k);

        // Display the rotated linked list
        System.out.println("\nRotated Linked List:");
        printLinkedList(rotatedHead);
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode last = head;
        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;
        while (last.next != null) {
            count++;
            last = last.next;
        }
        int ans = count - k % count; // Corrected the calculation of rotation index
        if (ans == count) {
            return head;
        }
        while (ans != 0) {
            ListNode tmp = head;
            head = head.next;
            last.next = tmp;
            tmp.next = null;
            last = last.next;
            ans--;
        }
        return head;
    }
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
