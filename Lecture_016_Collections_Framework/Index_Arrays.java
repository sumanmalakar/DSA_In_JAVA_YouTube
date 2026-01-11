import java.util.Arrays;

public class Index_Arrays {
    public static void main(String[] args) {
        int nums[] = {-1,20,4,5,1};

        // System.out.println(nums);
        for(int x : nums) {
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(nums);
              for(int x : nums) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(nums, 4));
    }
}
