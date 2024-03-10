public class queueImplementationArray {
    static class Queue{
        static int arr[];
        static int rear=-1;
        static int size;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //enqueue
        public static void add(int data){
            if(rear==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty now");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){  // Change the condition to stop one position before the end
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty na dada!");
            }
            return arr[0];
        }

    }
    public static void main(String args[]){
        Queue q=new Queue(10);
        q.add(78);
        q.add(69);
        q.remove();
        System.out.println(q.peek());

    }
}
