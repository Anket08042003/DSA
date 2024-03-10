import java.util.ArrayList;

public class stackImplementationArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int x){
            list.add(x);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(34);
        st.push(78);
        st.pop();
        System.out.println(st.peek());
    }
}
