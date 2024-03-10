public class queueImplementationLinklist {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
        
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //enque
        public static void add(int data){
            Node newNode=new Node(data);
            if(tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            
            head=head.next;
            return front;
        }

        //peek
        public static void peek(){
            System.out.println(head.data);
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();

    }
}
