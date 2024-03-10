public class M002 {
    public static void main(String[] args) {
        // Create two linked lists representing numbers: 342 and 465
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Call addTwoNumbers and print the result
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("Sum of the two numbers:");
        printLinkedList(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        int sum = 0;
        int carr = 0;
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carr;
            temp.next = new ListNode(sum % 10);
            carr = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        while (l1 != null) {
            sum = l1.val + carr;
            temp.next = new ListNode(sum % 10);
            carr = sum / 10;
            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            sum = l2.val + carr;
            temp.next = new ListNode(sum % 10);
            carr = sum / 10;
            l2 = l2.next;
            temp = temp.next;
        }

        if (carr > 0) {
            temp.next = new ListNode(carr);
        }

        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
