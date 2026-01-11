import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Index {
    public static void main(String[] args) {

        // List<Integer> l1 = new ArrayList<>();
        // List<Integer> l2 = new ArrayList<>(List.of(1,2,3,4));

        // l1.add(10);
        // l1.add(20);
        // l1.add(30);
        // l1.addAll(List.of(40,50,60));
        // l1.add(1,100);

        // System.out.println(l1);
        // System.out.println(l1.get(1));
        // System.out.println(l1.get(2));
        // l1.set(1, 200);
        // l1.remove(3);
        // l1.remove(Integer.valueOf(60));

        // System.out.println(l1);
        // System.out.println("Size of l1 = "+l1.size());
        // System.out.println(l1.contains(500));
        // // System.out.println(l2);

        // List<Integer> l1 = new ArrayList<>(List.of(1,2,3,4));

        // System.out.println(l1);

        // Iterator<Integer> it = l1.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


        // for(int i = 0; i<l1.size(); i++){
        //     System.out.print(l1.get(i)+" ");
        // }

        // for(int x : l1){
        //     System.out.println(x);
        // }

        List<List<Integer>> mat = new ArrayList<>();

        List<Integer>l1 = new ArrayList<>(List.of(10,20,30));

        mat.add(l1);
        mat.add(new ArrayList<>(List.of(1,2,3)));
        mat.add(new ArrayList<>(List.of(100,200)));

        System.out.println(mat);

        for(int i = 0; i<mat.size(); i++){
            for(int j = 0; j<mat.get(i).size(); j++){
                System.out.print(mat.get(i).get(j) +" ");
            }
            System.out.println();
        }


        // System.out.println(mat.size());
        // System.out.println(mat.get(2).size());
        // System.out.println(mat.get(0));
        // System.out.println(mat.get(1));
        // System.out.println(mat.get(1).get(1));
        // System.out.println(mat.get(0).get(2));

    }
}
