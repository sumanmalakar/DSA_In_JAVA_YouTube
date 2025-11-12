
public class Index {
    static int binary_search(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
     int nums [] = {2,5,8,12,16,23,38,56,72,91};
     int target = 91;
     int result = binary_search(nums, target);

     if(result != -1){
        System.out.println("Element found at index = "+result);
     }else{
        System.out.println("Element not found");
     }
    }

}
