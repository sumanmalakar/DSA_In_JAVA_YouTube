
public class Main {
   static void print(int nums[]) {
        System.out.println("Array elements are :-");
        for (int elements : nums) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {10,20,30,40,50};
     print(arr);

     int nums[] = {0,1,-2,5,6,-3};
     print(nums);

    }
}
