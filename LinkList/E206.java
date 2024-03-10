public class E206 {
    public static void main(String args[]) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseList(head);

        // Print the reversed linked list
        System.out.println("Reversed Linked List:");
        printLinkedList(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = null;
        if (head == null) {
            return head;
        }
        while (head.next != null) {
            ListNode nextNode = head.next;
            head.next = currNode;
            currNode = head;
            head = nextNode;
        }
        head.next = currNode;
        currNode = head;

        return currNode;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
