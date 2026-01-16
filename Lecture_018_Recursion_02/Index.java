
public class Index {

    public static boolean Ls(int nums[],int target, int index){
    // public static int Ls(int nums[],int target, int index){
        // if(index == nums.length) return -1;
        if(index == nums.length) return false;

        if(nums[index] == target) return true;
        // if(nums[index] == target) return index;

        return Ls(nums, target, index+1);

    }
    public static int maxi(int nums[],int index){
        // if(index == nums.length) return Integer.MAX_VALUE;
        if(index == nums.length) return Integer.MIN_VALUE;

        int curr = nums[index];
        int max = maxi(nums, index+1);

        return Math.max(curr, max);
        // return Math.min(curr, max);
    }

    public static int arr_sum(int nums[], int index){
        if(index == nums.length) return 0;

        return nums[index] + arr_sum(nums, index+1);
    }

    public static boolean isSorted(int nums[], int index){
        if(index == nums.length - 1) return true;

        if(nums[index] > nums[index+1]) return false;

        return isSorted(nums, index+1);
    }
    public static void main(String[] args) {
        // int nums[] = {10,20,5,50,10,500};
        // int target = 500;
        int nums[] = {10,200,30,40};

        System.out.println(isSorted(nums, 0));

        // System.out.println(arr_sum(nums, 0));

  
        // System.out.println(maxi(nums, 0));

        // System.out.println(Ls(nums, target, 0));
    }
}
