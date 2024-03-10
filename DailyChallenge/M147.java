public class M147 {
    public class Node {
            int data;
            Node next;
            Node() {}
            Node(int data) { this.data = data; }
            Node(int data, Node next) { this.data = data; this.next = next; }
        }
    public Node insertionSortList(Node head) {
        Node sortedList=new Node(-1,null);
        Node curr=head;
        while(head!=null){
            curr=head;
            head=head.next;
            if(sortedList==null || curr.data < sortedList.data){
                curr.next=sortedList;
                sortedList=curr;
            }
            else{
                Node temp=sortedList;
                while(temp.next!=null && curr.data>temp.next.data){
                    temp=temp.next;
                }
                curr.next=temp.next;
                temp.next=curr;
            }
        }
        return sortedList.next;
    }
}
