import java.util.ArrayDeque;
import java.util.Deque;

public class Index_ArrayQueue {
    public static void main(String[] args) {
        Deque<Integer>dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        System.out.println(dq);
    }
}
