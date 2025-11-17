
public class Index {
    static void bubble_sort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       int nums[] = {5,3,8,4,2};
       System.out.println("Before Swap");
       for(int x : nums) System.out.print(x+" ");
       System.out.println("\nAfter Swap");
       bubble_sort(nums);
       for(int x : nums) System.out.print(x+" ");

    }
}
