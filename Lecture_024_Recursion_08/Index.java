
public class Index {
    static int partition(int nums[], int low, int high){
        int pivot = nums[high];
        int index = low - 1;
        for(int j = low; j<high; j++){
            if(nums[j] < pivot){
                index++;
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
            }
        }

        // swap pivot element
        index++;
        int temp = nums[index];
        nums[index] = nums[high];
        nums[high] = temp;

        return index;
    }
    static void quick_sort(int nums[], int low, int high){
        if(low < high){
            // find out the pivot index
            int pivot_index = partition(nums, low, high);
            // left hand side
            quick_sort(nums, low, pivot_index-1);
            // right hand side
            quick_sort(nums, pivot_index+1, high);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,3,-1,0,1};

        quick_sort(nums,0,nums.length-1);

        for(int x : nums) System.out.print(x+" ");
    }
}
