public class M019 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call removeNthFromEnd and print the result
        int n = 2; // Specify the value of n
        ListNode modifiedList = removeNthFromEnd(head, n);

        System.out.println("Linked List after removing " + n + "th node from end:");
        printLinkedList(modifiedList);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int count = 1;
        ListNode right = head;
        ListNode left = head;
        ListNode tmp = head;
        while (count < n) {
            right = right.next;
            count++;
        }
        while (right.next != null) {
            tmp = left;
            left = left.next;
            right = right.next;
        }
        if (left == head) {
            head = head.next;
            return head;
        }
        tmp.next = tmp.next.next;

        return head;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
