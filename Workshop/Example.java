import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Example{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={2,3,5,6};
        list.add(23);
        list.add(45);
        System.out.println(list);

        list.remove(list.get(0));
        System.out.println(list );
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(67);
        list.add(89);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int length=list.size();
        System.out.println(length);

        int var=list.get(0);
        System.out.println(var);
        Stack<Integer> st=new Stack();
        st.push(45);
        st.push(49);
        System.out.println(st);

        int poped=st.pop();
        System.out.println(poped);

        System.out.println(st.peek());
        Queue<String> q = new LinkedList<>();
        q.offer(34);
        q.offer(34);
        System.out.println(q);

        int a=q.poll();
    }
}