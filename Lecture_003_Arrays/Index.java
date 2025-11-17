import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        // int nums[] = {10,20,30,40,50};

        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);

        // update
        // nums[1] = 200;

        // for(int i=0; i<nums.length; i++){
        //     System.out.print(nums[i]+" ");
        // }

        // for(int x : nums){
        //     System.out.print(x+" ");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int nums [] = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Arrays elements are ");
        for(int elements : nums){
            System.out.print(elements+" ");
        }

    }
}
 