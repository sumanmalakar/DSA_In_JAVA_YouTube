import java.util.Iterator;
import java.util.Stack;

public class Index_Stack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // Iterator<Integer> it = st.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
            
        // }
        System.out.println(st.size());
        System.out.println(st.empty());
        
        // System.out.println(st); // 10,20,30,40
        // System.out.println(st.pop()); // 40
        // System.out.println(st); // 10,20,30
        // System.out.println(st.peek());
        // System.out.println(st.search(10));
        // System.out.println(st.search(30));
        // for(int x : st){
        //     System.out.println(x);
        // }
    }
}
