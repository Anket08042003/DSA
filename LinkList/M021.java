public class M021 {
    public static void main(String[] args) {
        // Create two sorted linked lists: 1 -> 3 -> 5 and 2 -> 4 -> 6
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Call mergeTwoLists and print the result
        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println("Merged Linked List:");
        printLinkedList(mergedList);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while (list1 != null && list2 != null) {
            ListNode tmp = null;
            while (list1 != null && list1.val <= list2.val) {
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2;

            ListNode temp = list2;
            list2 = list1;
            list1 = temp;
        }
        return res;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
