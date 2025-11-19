
public class Index {
    static void insertion_sort(int nums[]){
      int n = nums.length;
      for(int i=1; i<n; i++){
        int key = nums[i];
        int j = i - 1;
        while (j>=0 && nums[j] > key) {
             nums[j+1] = nums[j];
             j--;
        }
        nums[j+1] = key;
      }
    }
    public static void main(String[] args) {
        int nums[] = {5,3,4,1,2};
        insertion_sort(nums);
        for(int x : nums) System.out.print(x+" ");
    }
}
