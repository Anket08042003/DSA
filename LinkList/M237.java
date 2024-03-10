public class M237 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Delete the node with value 2
        ListNode nodeToDelete = head.next; // You need to provide the reference to the node to delete
        deleteNode(nodeToDelete);

        // Print the linked list after deletion
        System.out.println("Linked List after deleting node:");
        printLinkedList(head);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
