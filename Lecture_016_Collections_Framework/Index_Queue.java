import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Index_Queue {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.add(100);
        q.add(20);
        q.add(-30); // avoid
        q.offer(40);

        System.out.println(q);

        for(int x : q){
            System.out.println(x);
        }




        // System.out.println(q);
        // q.remove(); // avoid
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.peek());
        // System.out.println(q.size());
        
    }
}
