
public class Index {
    public static int linear_search(int [] nums, int target){
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == target) return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10,0,-2,5,-1,9,3};
        int target = -10;

        int result = linear_search(nums, target);

        if(result != -1){
            System.out.println("Element found at index "+result);
        }else{
            System.out.println("Element was not found");
        }
    }
}
