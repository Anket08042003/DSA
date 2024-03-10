public class E160 {
    public static void main(String args[]) {
        // Create nodes for the first linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Connect nodes to form the first linked list
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Create nodes for the second linked list: 6 -> 7 -> 8 -> 9
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);

        // Connect nodes to form the second linked list
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        // Make the second linked list intersect with the first linked list at node 3
        node9.next = node3;

        // Call the getIntersectionNode method and print the result
        ListNode intersectionNode = getIntersectionNode(node1, node6);
        if (intersectionNode != null) {
            System.out.println("Intersection Node Value: " + intersectionNode.val);
        } else {
            System.out.println("No Intersection");
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dum1 = headA;
        ListNode dum2 = headB;
        int count1 = 0;
        int count2 = 0;

        if (headA == headB) {
            return headA;
        }

        if (headA == null || headB == null) {
            return null;
        }

        while (dum2 != null) {
            if (dum2 == headA) {
                return headA;
            }
            dum2 = dum2.next;
        }

        while (dum1 != null) {
            if (dum1 == headB) {
                return headB;
            }
            dum1 = dum1.next;
        }

        dum1 = headA;
        dum2 = headB;

        while (dum1 != null) {
            count1++;
            dum1 = dum1.next;
        }

        while (dum2 != null) {
            count2++;
            dum2 = dum2.next;
        }

        dum1 = headA;
        dum2 = headB;

        int diff = count1 - count2;

        if (diff > 0) {
            while (diff != 0) {
                dum1 = dum1.next;
                diff--;
            }
        } else {
            diff = -diff;
            while (diff != 0) {
                dum2 = dum2.next;
                diff--;
            }
        }

        while (dum1 != null && dum2 != null) {
            if (dum1 == dum2) {
                return dum1;
            }
            dum1 = dum1.next;
            dum2 = dum2.next;
        }

        return null;
    }
}
