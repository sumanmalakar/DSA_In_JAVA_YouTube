import java.util.LinkedList;
import java.util.Queue;

public class JQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        q.offer(40);
        q.offer(50);
        q.offer(60);


        System.out.println(q);
        
        System.out.println(q.remove());

        System.out.println(q);
        
        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.isEmpty());

    }
}