import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Index_HasSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(-10);
        set.add(200);
        set.add(30);
        set.add(4);
        // set.remove(20);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
            
        }

        // for(int x : set){
        //     System.out.print(x+" ");
        // }
        // System.out.println(set);
        // System.out.println(set.contains(200));
        // System.out.println(set.size());
    }
}
