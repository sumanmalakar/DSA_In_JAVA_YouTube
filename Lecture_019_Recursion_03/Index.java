
public class Index {

    public static int binary_search(int nums[], int target, int s, int e) {
        // base case
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[mid] > target) {
            e = mid - 1;
            return binary_search(nums, target, s, e);
        } else {
            s = mid + 1;
            return binary_search(nums, target, s, e);
        }
    }

    public static int firstOccurence(int nums[], int target, int s , int e){
        if(s > e) return -1;

        int mid = s + (e-s)/2;

        if(nums[mid] == target){
            e = mid - 1;
            int res = firstOccurence(nums, target, s, e);
            return (res != -1) ? res : mid;
        }
        if(nums[mid] > target) {
            e = mid - 1;
            return firstOccurence(nums, target, s, e);
        }
        else{
            s = mid + 1;
            return firstOccurence(nums, target, s, e);
        }
    }

    public static int LastOccurence(int nums[], int target, int s , int e){
        if(s > e) return -1;

        int mid = s + (e-s)/2;

        if(nums[mid] == target){
            // e = mid - 1;
            s = mid + 1;
            int res = LastOccurence(nums, target, s, e);
            return (res != -1) ? res : mid;
        }
        if(nums[mid] > target) {
            e = mid - 1;
            return LastOccurence(nums, target, s, e);
        }
        else{
            s = mid + 1;
            return LastOccurence(nums, target, s, e);
        }
    }


    public static void main(String[] args) {
        int nums[] = { 10, 20,20, 30,30 ,40, 50 };
        int target = 20;
        // int result = binary_search(nums, target, 0, nums.length - 1);

        // int result = firstOccurence(nums, target, 0, nums.length - 1);
        int result = LastOccurence(nums, target, 0, nums.length - 1);

        if (result != -1) {
            System.out.println("Element found at index = " + result);
        } else {
            System.out.println("Element not found");
        }

    }

}
