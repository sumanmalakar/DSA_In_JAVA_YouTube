import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Index_Collections {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(List.of(-1,10,0,3,20));

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        // Collections.reverse(l1);
        System.out.println(l1);
        // System.out.println(Collections.max(l1));
        // System.out.println(Collections.min(l1));
        System.out.println(Collections.binarySearch(l1, 10));
    }
}
