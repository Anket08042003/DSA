import java.util.Arrays;

public class E876 {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call middleNode to get the middle node of the list
        ListNode middleNode = middleNode(head);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        System.out.println("\nMiddle Node Value: " + middleNode.val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode target = head;
        ListNode helper = head;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        while (helper.next != null) {
            if (helper.next.next == null) {
                target = target.next;
                break;
            }
            target = target.next;
            helper = helper.next.next;
        }
        return target;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
